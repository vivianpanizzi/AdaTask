package br.com.ada.projetopooii.Controller;

import java.util.Scanner;

public class PersonalTaskController {

    Scanner scanner = new Scanner(System.in);


    public void menuPersonalTask () {

        System.out.println("---------- Personal Task ---------- \n" +
                            "Escolha a ação: \n" +
                            "1- Adicionar Tarefa \n" +
                            "2- Alterar Tarefa \n" +
                            "3- Visualizar Tarefa \n" +
                            "4- Deletar Tarefa \n" +
                            "Digite a ação escolhida: ");
        int opcao = scanner.nextInt();
    }

    public void menuVisulizar(){

    }

}
