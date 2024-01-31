package br.com.ada.projetopooii.Domain;

public class WorkTask extends BaseTask {
    public WorkTask(Integer id, String nome, String descricao, int prazoEmDias) {
        super(id, nome, descricao, prazoEmDias);
    }

    public String toString() {
        return "ID: " + getId() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Prazo em dias: " + getPrazoEmDias();
    }

}
