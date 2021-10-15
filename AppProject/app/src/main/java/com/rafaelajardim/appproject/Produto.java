package com.rafaelajardim.appproject;

public class Produto {
    public int id;

    public String nome, categoria, estabelecimento,tipo;

    public Produto() {
    }

    public Produto(String nome, String categoria, String estabelecimento, String tipo) {
        this.nome = nome;
        this.categoria = categoria;
        this.estabelecimento = estabelecimento;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome + "  |  " + categoria + "  |  " + estabelecimento + "  |  " + tipo;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstabelecimento() { return estabelecimento; }

    public void setEstabelecimento(String estabelecimento) { this.estabelecimento = estabelecimento; }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }
}
