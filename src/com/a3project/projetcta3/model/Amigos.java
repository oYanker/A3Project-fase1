package com.a3project.projetcta3.model;

import com.a3project.projetcta3.DAO.FerramentasDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Amigos {

    private int id;
    private String nome;
    private int telefone;
    private String email;
    private final FerramentasDAO dao;

    public Amigos() {
        this.dao = new FerramentasDAO();
    }

    public Amigos(int id, String nome, int telefone, String email) {

        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dao = new FerramentasDAO();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome:" + this.getNome()
                + "\n Telefone:" + this.getTelefone()
                + "\n E-mail:" + this.getEmail()
                + "\n -----------";
    }

    public ArrayList getMinhaListaAmigos() {
        return dao.getMinhaListaAmigos();
    }

    public boolean InsertAmigosBD(String nome, int telefone, String email) throws SQLException {
        int id = this.maiorIDAmigos() + 1;
        Amigos objeto = new Amigos(id, nome, telefone, email);
        dao.InsertAmigosBD(objeto);
        return true;

    }

    public boolean DeleteAmigosBD(int id) {
        dao.DeleteAmigosBD(id);
        return true;
    }

    public boolean UpdateAmigosBD(int id, String nome, int telefone, String email) {
        Amigos objeto = new Amigos(id, nome, telefone, email);
        dao.UpdateAmigosBD(objeto);
        return true;
    }

    private int maiorIDAmigos() throws SQLException {
        return dao.maiorIDAmigos();
    }

    public Ferramentas carregaAmigos(int id) {
        dao.carregaAmigos(id);
        return null;
    }

}
