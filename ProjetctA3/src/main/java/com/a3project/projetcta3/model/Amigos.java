
package com.a3project.projetcta3.model;


public class Amigos {
    private int id;
    private String nome;
    private int telefone;

    public Amigos() {
    }

    public Amigos(int id, String nome, int telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
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

    public int getIdade() {
        return telefone;
    }

    public void setIdade(int telefone) {
        this.telefone = telefone;
    }

}

