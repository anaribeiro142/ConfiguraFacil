/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Business.Fabrica;

/**
 *
 * @author Grupo 30
 */
public class Stock {
    
    /** Qunatidade de stock */
    private int quantidade;
    /** Nome da componente do stock */
    private String componente;
    
    /**
     * Construtor da classe Stock sem parâmetros.
     */
    public Stock(){
        this.componente = "";
        this.quantidade = 0;
    }
    
    /**
     * Construtor da classe Stock com paramêtros. 
     * @param q Quantidade de stock.
     * @param c Componente do stock.
     */
    public Stock(int q, String c){
        this.quantidade = q;
        this.componente = c;
    }
    
    /**
     * Construtor por cópia da classe Stock
     * @param c Stock.
     */
    public Stock(Stock c){
        this.quantidade = c.getQuantidade();
        this.componente = c.getComponente();
    }
    
    /**
     * Devolve a quantidade de stock.
     * @return quantidade
     */
    public int getQuantidade(){
        return this.quantidade;
    }
    
    /**
     * Devolve o nome da componente do stock.
     * @return nome
     */
    public String getComponente(){
        return this.componente;
    }
    
    /**
     * Altera o quantidade do stock.
     * @param q Nova quantidade
     */
    public void setQuantidade(int q){
        this.quantidade = q;
    }
    
    /**
     * Altera a componente do stock.
     * @param c Nova componente do stock.
     */
    public void setComponente(String c){
        this.componente = c;
    }
    
    /**
     * Devolve String com a informação da classe Stock.
     * @return String
     */
     public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A componente ");
        sb.append(this.componente);
        sb.append(" tem quantidade ");
        sb.append(this.quantidade);
        sb.append(" .\n");

        return sb.toString();
    }
    
     /**
     * Função equals da classe Stock.
     * @param o Objecto
     * @return boolean
     */
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Stock s = (Stock) o;
        return s.getComponente().equals(this.componente)
                && s.getQuantidade() == this.quantidade;
    }
   
}
