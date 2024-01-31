package br.com.ada.projetopooii.Domain;

public class PersonalTask extends BaseTask{

    private String tipoTask;
    public PersonalTask(String nome, String descricao, int prazoEmDias) {
        super(nome, descricao, prazoEmDias);
    }

    public String getTipoTask() {
        return tipoTask;
    }

}

