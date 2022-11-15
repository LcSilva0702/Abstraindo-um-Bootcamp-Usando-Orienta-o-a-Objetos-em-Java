package br.dio.com.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(){

    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    @Override
    public String toString() {
        return "Titulo " + " - " + getTitulo() + " Descricao " + " - " + getDescricao() + " - " + " Carga horaria" + " - " + cargaHoraria ;
    }
    @Override
    public double calcularXp() {
        return xp_Padrao * cargaHoraria;
    }
}
