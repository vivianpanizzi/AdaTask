package br.com.ada.projetopooii.Domain;

import java.time.LocalDate;

public class BaseTask {
    private Integer id;
    private String nome;
    private String descricao;
    private int prazo;
    private LocalDate dataHoje;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
