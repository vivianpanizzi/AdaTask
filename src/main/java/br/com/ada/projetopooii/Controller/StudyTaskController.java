package br.com.ada.projetopooii.Controller;

import java.util.Scanner;

public class StudyTaskController {

    Scanner scanner = new Scanner(System.in);

    public void menuStudyTask () {

        System.out.println("---------- Study Task ---------- \n" +
                "Escolha a ação: \n" +
                "1- Adicionar Tarefa \n" +
                "2- Alterar Tarefa \n" +
                "3- Visualizar Tarefa \n" +
                "4- Deletar Tarefa \n" +
                "Digite a ação escolhida: ");
        int opcao = scanner.nextInt();

    }
}
