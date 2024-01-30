package br.com.ada.projetopooii.Domain;

import java.time.LocalDate;

public class BaseTask {
    private Integer id;
    private String nome;
    private String descricao;
    private int prazo;
    private LocalDate dataHoje;

    public BaseTask(String nome, String descricao, int prazo) {
        this.nome = nome;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public LocalDate getDataHoje() {
        return dataHoje;
    }

}
