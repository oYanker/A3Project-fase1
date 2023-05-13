package com.a3project.projetcta3.model;

import java.util.*;
import com.a3project.projetcta3.DAO.FerramentasDAO;
import java.sql.SQLException;

public class Ferramentas extends Amigos {

    private String nome_ferramenta;
    private double valor;
    private String marca;
    private final FerramentasDAO dao;

    public Ferramentas() {
        this.dao = new FerramentasDAO();
    }

    public Ferramentas(String nome_ferramenta, double valor, String marca) {
        this.nome_ferramenta = nome_ferramenta;
        this.valor = valor;
        this.marca = marca;
        this.dao = new FerramentasDAO();
    }

    public Ferramentas(int id, String nome, int telefone, String nome_ferramenta, double valor, String marca) {
        super(id, nome, telefone);
        this.nome_ferramenta = nome_ferramenta;
        this.valor = valor;
        this.marca = marca;
        this.dao = new FerramentasDAO();

    }

    public String getNome_ferramenta() {
        return nome_ferramenta;
    }

    public void setNome_ferramenta(String nome) {
        this.nome_ferramenta = nome;
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
                + "\n Telefone: " + this.getTelefone()
                + "\n Ferramenta:" + this.getNome_ferramenta()
                + "\n Valor:" + this.getValor()
                + "\n marca:" + this.getMarca()
                + "\n -----------";
    }

    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    public boolean InsertFerramentaBD(String nome, int telefone, String nome_ferramenta, double valor, String marca) throws SQLException {
        int id = this.maiorID() + 1;
        Ferramentas objeto = new Ferramentas(id,nome, telefone, nome_ferramenta, valor, marca);
        dao.InsertFerramentaBD(objeto);
        return true;

    }

    public boolean DeleteFerramentaBD(int id) {
        dao.DeleteFerramentaBD(id);
        return true;
    }

    public boolean UpdateFerramentaBD(int id, String nome, int telefone, String nome_ferramenta, double valor, String marca) {
        Ferramentas objeto = new Ferramentas(id, nome, telefone, nome_ferramenta, valor, marca);
        dao.UpdateFerramentaBD(objeto);
        return true;
    }

    private int maiorID() throws SQLException {
        return dao.maiorID();
    }

    public Ferramentas carregaFerramenta(int id) {
        dao.carregaFerramenta(id);
        return null;
    }

}
