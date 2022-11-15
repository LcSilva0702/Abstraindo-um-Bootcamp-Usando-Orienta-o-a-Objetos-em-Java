package br.dio.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria(){

    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data " + data + " - " + " Titulo " + " - " + "Descricao" + getDescricao();
    }
    
    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return xp_Padrao + 20d  ;
    }
}
