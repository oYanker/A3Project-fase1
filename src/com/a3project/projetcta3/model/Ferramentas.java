package com.a3project.projetcta3.model;

import java.util.*;
import com.a3project.projetcta3.DAO.FerramentasDAO;
import java.sql.SQLException;

public class Ferramentas extends Amigos {

    private int id_ferramenta;
    private String nome_ferramenta;
    private double valor;
    private String marca;
    private final FerramentasDAO dao;

    public Ferramentas() {
        this.dao = new FerramentasDAO();
    }

    public Ferramentas(int id_ferramenta, String nome_ferramenta, double valor, String marca) {
        this.id_ferramenta = id_ferramenta;
        this.nome_ferramenta = nome_ferramenta;
        this.valor = valor;
        this.marca = marca;
        this.dao = new FerramentasDAO();
    }

    public int getId_Ferramenta() {
        return id_ferramenta;
    }

    public void setId_Ferramenta(int id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
    }

    public String getNome_Ferramenta() {
        return nome_ferramenta;
    }

    public void setNome_Ferramenta(String nome) {
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
        return "\n ID: " + this.getId_Ferramenta()
                + "\n Ferramenta:" + this.getNome_Ferramenta()
                + "\n Valor:" + this.getValor()
                + "\n marca:" + this.getMarca()
                + "\n -----------";
    }

    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    public boolean InsertFerramentaBD(String nome_ferramenta, double valor, String marca) throws SQLException {
        int id_ferramenta = this.maiorID() + 1;
        Ferramentas objetoFerramenta = new Ferramentas(id_ferramenta, nome_ferramenta, valor, marca);
        dao.InsertFerramentaBD(objetoFerramenta);
        return true;

    }

    public boolean DeleteFerramentaBD(int id_ferramenta) {
        dao.DeleteFerramentaBD(id_ferramenta);
        return true;
    }

    public boolean UpdateFerramentaBD(int id_ferramenta, String nome_ferramenta, double valor, String marca) {

        Ferramentas objetoFerramenta = new Ferramentas(id_ferramenta, nome_ferramenta, valor, marca);

        dao.UpdateFerramentaBD(objetoFerramenta);
        return true;
    }

    private int maiorID() throws SQLException {
        return dao.maiorID();
    }

    public Ferramentas carregaFerramenta(int id_ferramenta) {
        dao.carregaFerramenta(id_ferramenta);
        return null;
    }

}
