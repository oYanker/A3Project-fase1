package com.a3project.projetcta3.model;

import java.util.*;
import com.a3project.projetcta3.DAO.FerramentasDAO;
import java.sql.SQLException;

/**
 *
 * @author drera
 */
public class Ferramentas extends Amigos {

    private int id_ferramenta;
    private String nome_ferramenta;
    private double valor;
    private String marca;
    private final FerramentasDAO dao;

    /**
     *
     */
    public Ferramentas() {
        this.dao = new FerramentasDAO();
    }

    /**
     * @param id_ferramenta
     * @param nome_ferramenta
     * @param valor
     * @param marca
     */
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

    /**
     *
     * @param id_Ferramenta
     */
    public void setId_Ferramenta(int id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
    }

    /**
     *
     * @return
     */
    public String getNome_Ferramenta() {
        return nome_ferramenta;
    }

    /**
     *
     * @param nome
     */
    public void setNome_Ferramenta(String nome) {
        this.nome_ferramenta = nome;
    }

    /**
     *
     * @return
     */
    public double getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\n ID: " + this.getId_Ferramenta()
                + "\n Ferramenta:" + this.getNome_Ferramenta()
                + "\n Valor:" + this.getValor()
                + "\n marca:" + this.getMarca()
                + "\n -----------";
    }

    /**
     *
     * @return
     */
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    /**
     *
     * @param nome_ferramenta
     * @param valor
     * @param marca
     * @return
     * @throws SQLException
     */
    public boolean InsertFerramentaBD(String nome_ferramenta, double valor, String marca) throws SQLException {
        int id_ferramenta = this.maiorID() + 1;
        Ferramentas objetoFerramenta = new Ferramentas(id_ferramenta, nome_ferramenta, valor, marca);
        dao.InsertFerramentaBD(objetoFerramenta);
        return true;

    }

    /**
     *
     * @param id_ferramenta
     * @return
     */
    public boolean DeleteFerramentaBD(int id_ferramenta) {
        dao.DeleteFerramentaBD(id_ferramenta);
        return true;
    }

    /**
     *
     * @param id_ferramenta
     * @param nome_ferramenta
     * @param valor
     * @param marca
     * @return
     */
    public boolean UpdateFerramentaBD(int id_ferramenta, String nome_ferramenta, double valor, String marca) {
        Ferramentas objetoFerramenta = new Ferramentas(id_ferramenta, nome_ferramenta, valor, marca);
        dao.UpdateFerramentaBD(objetoFerramenta);
        return true;
    }

    private int maiorID() throws SQLException {
        return dao.maiorID();
    }

    /**
     *
     * @param id_ferramenta
     * @return
     */
    public Ferramentas carregaFerramenta(int id_ferramenta) {
        dao.carregaFerramenta(id_ferramenta);
        return null;
    }

}
