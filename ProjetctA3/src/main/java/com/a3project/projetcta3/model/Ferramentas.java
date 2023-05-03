
package com.a3project.projetcta3.model;
import java.util.*;
import com.a3project.projetcta3.DAO.FerramentasDAO;
import java.sql.SQLException;

public class Ferramentas extends Amigos{
    private String nome;
    private double valor;
    private String marca;
    
     public Ferramentas() {
   
    }
     public Ferramentas(String nome,double valor, String marca){
         this.nome = nome;
         this.valor = valor;
         this.marca = marca;
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
    
}
