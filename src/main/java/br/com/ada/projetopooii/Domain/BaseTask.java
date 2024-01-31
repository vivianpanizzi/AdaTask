package br.com.ada.projetopooii.Domain;

import java.time.LocalDate;

public class BaseTask {
    private Integer id;
    private String nome;
    private String descricao;
    private int prazoEmDias;
    private LocalDate dataCriacao;

    public BaseTask(String nome, String descricao, int prazoEmDias) {
        this.nome = nome;
        this.descricao = descricao;
        this.prazoEmDias = prazoEmDias;
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

    public int getPrazoEmDias() {
        return prazoEmDias;
    }

    public void setPrazoEmDias(int prazo) {
        this.prazoEmDias = prazo;
    }

    public LocalDate getdataCriacao() {
        return dataCriacao;
    }

}
