package br.dio.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria(){

    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDate getData() {
        return data;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Data " + data + " - " + " Titulo " + " - " + "Descricao" + descricao;
    }
}
