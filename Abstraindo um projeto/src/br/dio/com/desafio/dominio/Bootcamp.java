package br.dio.com.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Bootcamp {
    
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private Set<Dev> devs = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet();

    public Bootcamp(){

    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public String getDescricao() {
        return descricao;
    }
    public Set<Dev> getDevs() {
        return devs;
    }
    public String getNome() {
        return nome;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
