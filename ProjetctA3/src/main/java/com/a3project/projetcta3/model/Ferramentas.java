
package com.a3project.projetcta3.model;
import java.util.*;
import com.a3project.projetcta3.DAO.FerramentasDAO;
import java.sql.SQLException;

public class Ferramentas extends Amigos{
    private String nome;
    private double valor;
    private String marca;
    private final FerramentasDAO dao;
    
     public Ferramentas() {
   this.dao = new FerramentasDAO();
    }
     public Ferramentas(String nome,double valor, String marca){
         this.nome = nome;  
         this.valor = valor;
         this.marca = marca;
         this.dao = new FerramentasDAO();
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Curso: " + this.getMarca()
                + "\n Fase:" + this.getValor()
                + "\n -----------";
    }
    public ArrayList getMinhaLista(){
        return dao.getMinhaLista();
    }
    
    public boolean InsertFerramentaBD(String nome, double valor, String marca) throws SQLException {
        int id = this.maiorID() + 1;
        Ferramentas objeto = new Ferramentas(nome, valor, marca);
        dao.InsertFerramentaBD(objeto);
        return true;

    }
    
    public boolean DeleteFerramentaBD(int id) {
        dao.DeleteFerramentaBD(id);
        return true;
    }
    
    public boolean UpdateFerramentaBD(String nome, double valor, String marca) {
        Ferramentas objeto = new Ferramentas(nome, valor, marca);
        dao.UpdateFerramentaBD(objeto);
        return true;
    }

    private int maiorID() throws SQLException {
        return dao.maiorID();
    }
    public Ferramentas carregaFerramenta(int id) {
        dao.carregaFerramentas(id);
        return null;
    }
}
