package br.com.ada.projetopooii.Domain;

public class PersonalTask extends BaseTask{

    private String tipoTask;
    public PersonalTask(Integer id, String nome, String descricao, int prazoEmDias) {
        super(id,nome, descricao, prazoEmDias);
    }

    public String getTipoTask() {
        return tipoTask;
    }

    public String toString() {
        return "ID: " + getId() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Prazo em dias: " + getPrazoEmDias();
    }
}

