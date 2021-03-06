/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Database;

import configurafacil.Business.Fabrica.GestaoEncomenda.Encomenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Grupo 30
 */
public class EncomendaDAO implements Map<Integer,Encomenda> {
    
    private Connection c;

    @Override
    public int size() {
       int s = -1;
        try {
            c = Connect.connect();
            PreparedStatement stm = c.prepareStatement("SELECT count(*) FROM Encomenda");
            ResultSet rs = stm.executeQuery();
            if(rs.next()) {
                s = rs.getInt(1);
            }
        }
        catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
        finally {
            Connect.close(c);
        }
        return s;
    }

    @Override
    public boolean isEmpty() {
        return (this.size() == 0);
    }

    @Override
    public boolean containsKey(Object o) {
        boolean res = false;
        try {
            c = Connect.connect();
            String sql = "SELECT idEncomenda FROM Encomenda WHERE idEncomenda = ?";
            PreparedStatement stm = c.prepareStatement(sql);
            stm.setString(1, Integer.toString((Integer) o));
            ResultSet rs = stm.executeQuery();
            res = rs.next();
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        } finally {
            Connect.close(c);
        }
        return res;
    }

    @Override
    public boolean containsValue(Object o) {
        boolean res = false;
        
        if(o.getClass().getName().equals("configuraFacil.Business.Fabrica.GestaoEncomenda.Encomenda")){
            Encomenda e = (Encomenda) o;
            int id = e.getId();
            Encomenda enc = this.get(id);
            if(enc.equals(e)){
                res = true;
            }
        }
       return res;
    }

    @Override
    public Encomenda get(Object o) {
       Encomenda e = new Encomenda();
        
        try{
            c = Connect.connect();
            String sql = "SELECT * FROM Encomenda WHERE idEncomenda = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, Integer.toString((Integer) o));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                e.setId(rs.getInt("idEncomenda"));
                e.setCarro(rs.getString("Carro"));   
                e.setEstado(rs.getInt("Estado"));
                e.setPacote(rs.getString("Pacote"));
                e.setLimite(rs.getDouble("Limite"));
                e.setCliente(rs.getString("Cliente"));
                sql = "SELECT Nome FROM Componente AS C\n" + 
                        "JOIN Encomenda_Componente AS EC ON C.nome = EC.Componente\n" +
                        "WHERE EC.Encomenda = ?;";
                ps = c.prepareStatement(sql);
                ps.setInt(1, (Integer) o);
                rs = ps.executeQuery();
                List<String> componentes = new ArrayList<>();
                while (rs.next()) { 
                        componentes.add(rs.getString("Nome"));
                }
                e.setConfig(componentes);
            } 
        }
        catch(Exception ex){
            System.out.printf(ex.getMessage());
        }
        finally{
            try{
               Connect.close(c);
            }
            catch(Exception ex){
                System.out.printf(ex.getMessage());
            }
        }
        return e;
    }

    @Override
    public Encomenda put(Integer k, Encomenda v) {
        Encomenda e;

        if(this.containsKey(k)){
            e = this.get(k);
        }
        else e = v;
        try{
            c = Connect.connect();
            
           
           String sql = "INSERT INTO Encomenda (idEncomenda, Estado, Limite, Carro, Cliente, Pacote)" +
                   "VALUES (?,?,?,?,?,?)\n" +
                   "ON DUPLICATE KEY UPDATE Estado = VALUES(Estado),\n" +
                   "Limite = VALUES(Limite),\n"+
                   "Carro = VALUES(Carro),\n" +
                   "Cliente = VALUES(Cliente),\n" +
                   "Pacote = VALUES(Pacote);\n";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1,k);
            ps.setString(2,Integer.toString(v.getEstado()));
            ps.setDouble(3, v.getLimite());
            ps.setString(4,v.getCarro());
            ps.setString(5, v.getCliente());
            ps.setString(6, v.getPacote());
            ps.executeUpdate();

             sql = "INSERT INTO Encomenda_Componente (Encomenda, Componente)" +
                      "VALUES (?, ?)\n" + 
                    "ON DUPLICATE KEY UPDATE Componente = VALUES(Componente);\n";
            PreparedStatement stm;         
            stm = c.prepareStatement(sql);
            for(String s : v.getConfig()){
                stm.setInt(1,k);
                stm.setString(2, s);
                stm.addBatch();   
            }
            stm.executeBatch();
            e = v;
        }
        catch(Exception ex){
            System.out.printf(ex.getMessage());
        }
        finally{
            try{
                Connect.close(c);
            }
            catch(Exception ex){
                System.out.printf(ex.getMessage());
            }
        }
        return e;
    }
    
    private PreparedStatement updateConfiguracao(Encomenda v) throws Exception {
        String sql = "INSERT INTO Encomenda_Componente (Encomenda, Componente)" +
                      "VALUES (?, ?)," +
                      "ON DUPLICATE KEY UPDATE Componente = VALUES(Componente);";
             
                       
           PreparedStatement ps = c.prepareStatement(sql);
                for(String s : v.getConfig()){
                    ps.setInt(1,v.getId());
                    ps.setString(2, s);
                    ps.addBatch();   
                }
                return ps;
    }

    @Override
    public Encomenda remove(Object o) {
        throw new UnsupportedOperationException("Não implementado");
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Encomenda> map) {
        for(Encomenda e : map.values()) {
            put(e.getId(), e);
        }
    }

    @Override
    public void clear() {
       try{
            c = Connect.connect();
            PreparedStatement ps = c.prepareStatement("DELETE FROM Encomenda");
            ps.executeUpdate();
        }
        catch(Exception e){
            System.out.printf(e.getMessage());
        }
        finally{
            try{
                Connect.close(c);
            }
            catch(Exception e){
                System.out.printf(e.getMessage());
            }
        }
    }

    @Override
    public Set<Integer> keySet() {
      Set<Integer> keys = null;
        
        try{
            c = Connect.connect();
            keys = new HashSet<>();
            PreparedStatement ps = c.prepareStatement("SELECT idEncomenda FROM Encomenda");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                keys.add(rs.getInt(1));
            }   
        }
        catch(Exception e){
            System.out.printf(e.getMessage());
        }
        finally{
            try{
                Connect.close(c);
            }
            catch(Exception e){
                System.out.printf(e.getMessage());
            }
        }
        return keys;
    }

    @Override
    public Collection<Encomenda> values() {
        Set<Encomenda> encs = new HashSet<>();
        Set<Integer> keys = new HashSet<>(this.keySet());
        for(Integer k : keys){
            encs.add(this.get(k));
        }
        return encs;
    }

    @Override
    public Set<Entry<Integer, Encomenda>> entrySet() {
        Set<Integer> keys = new HashSet<>(this.keySet());
        Map<Integer,Encomenda> map = new HashMap<>();
        
        for(Integer k : keys){
            map.put(k,this.get(k));
        }
        return map.entrySet();
    }
    
}
