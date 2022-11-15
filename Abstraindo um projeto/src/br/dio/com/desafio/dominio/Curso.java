package br.dio.com.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso(){

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Titulo " + " - " + titulo + " Descricao " + " - " + descricao + " - " + " Carga horaria" + " - " + cargaHoraria ;
    }
}
