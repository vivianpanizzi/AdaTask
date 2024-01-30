package br.com.ada.projetopooii;

import java.util.Scanner;

public class TaskApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------   Task    --------");
        System.out.println("---------------------------");


        //criar usuário teste para não precisar ficar criando a toda hora

        System.out.println("--------   Menu    --------");
        System.out.println("Escolha o tipo de tarefa:");
        System.out.println("1- Pessoal");
        System.out.println("2- Estudo");
        System.out.println("3- Trabalho");
        int opcao = scanner.nextInt();

        System.out.println(opcao);

        System.out.println("---------------------------------------------");
        System.out.println("Escolha a ação:");
        System.out.println("1- Adicionar Tarefa");
        System.out.println("2- Alterar Tarefa");
        System.out.println("3- Visualizar Tarefa");
        System.out.println("4- Deletar Tarefa");



        //iniciar o printl em cada caso

        //localdate.plusdays(5);

        //LocalDate diaHoje = LocalDate.now();
        //plus - plusDays(1);
        //minus - minusDays();
    }

    //Projeto final do curso de POOII do Devas

}


