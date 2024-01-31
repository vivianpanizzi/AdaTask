package br.com.ada.projetopooii.Controller;

import java.util.Scanner;

public class StudyTaskController {

    Scanner scanner = new Scanner(System.in);

    public void menuStudyTask () {

        System.out.println("Escolha a ação:");
        System.out.println("1- Adicionar Tarefa");
        System.out.println("2- Alterar Tarefa");
        System.out.println("3- Visualizar Tarefa");
        System.out.println("4- Deletar Tarefa");
        int opcao = scanner.nextInt();

    }
}
