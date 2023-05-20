package com.a3project.projetcta3.model;

import java.util.*;
import com.a3project.projetcta3.DAO.FerramentasDAO;
import java.sql.SQLException;

/**
 *
 * @author drera
 */
public class Ferramentas extends Amigos {

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
     *
     * @param nome_ferramenta
     * @param valor
     * @param marca
     */
    public Ferramentas(String nome_ferramenta, double valor, String marca) {
        this.nome_ferramenta = nome_ferramenta;
        this.valor = valor;
        this.marca = marca;
        this.dao = new FerramentasDAO();
    }

    /**
     *
     * @param id
     * @param nome
     * @param telefone
     * @param nome_ferramenta
     * @param valor
     * @param marca
     */
    public Ferramentas(int id, String nome_ferramenta, double valor, String marca) {

        this.nome_ferramenta = nome_ferramenta;
        this.valor = valor;
        this.marca = marca;
        this.dao = new FerramentasDAO();

    }

    /**
     *
     * @return
     */
    public String getNome_ferramenta() {
        return nome_ferramenta;
    }

    /**
     *
     * @param nome
     */
    public void setNome_ferramenta(String nome) {
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
        return "\n ID: " + this.getId()
                + "\n Ferramenta:" + this.getNome_ferramenta()
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
        int id = this.maiorID() + 1;
        Ferramentas objeto = new Ferramentas(id, nome_ferramenta, valor, marca);
        dao.InsertFerramentaBD(objeto);
        return true;

    }

    /**
     *
     * @param id
     * @return
     */
    public boolean DeleteFerramentaBD(int id) {
        dao.DeleteFerramentaBD(id);
        return true;
    }

    /**
     *
     * @param id
     * @param nome
     * @param telefone
     * @param nome_ferramenta
     * @param valor
     * @param marca
     * @return
     */
    public boolean UpdateFerramentaBD(int id, String nome_ferramenta, double valor, String marca) {
        Ferramentas objeto = new Ferramentas(id, nome_ferramenta, valor, marca);
        dao.UpdateFerramentaBD(objeto);
        return true;
    }

    private int maiorID() throws SQLException {
        return dao.maiorID();
    }

    /**
     *
     * @param id
     * @return
     */
    public Ferramentas carregaFerramenta(int id) {
        dao.carregaFerramenta(id);
        return null;
    }

}
