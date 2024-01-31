package br.com.ada.projetopooii;

import br.com.ada.projetopooii.Controller.PersonalTaskController;
import br.com.ada.projetopooii.Controller.StudyTaskController;
import br.com.ada.projetopooii.Controller.WorkTaskController;
import br.com.ada.projetopooii.Domain.PersonalTask;

import java.util.Scanner;

public class TaskApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PersonalTaskController personalTaskController = new PersonalTaskController();
        StudyTaskController studyTaskController = new StudyTaskController();
        WorkTaskController workTaskController = new WorkTaskController();

        PersonalTask personalTask = new PersonalTask("Arrumar quarto", "Limpar e arrumar o quarto", 15);

        System.out.println("--------   Task    --------");
        System.out.println("---------------------------");


        System.out.println("--------   Menu    --------");
        System.out.println("Escolha o tipo de tarefa: \n" +
                            "1- Pessoal \n" +
                            "2- Estudo \n" +
                            "3- Trabalho \n" +
                            "Opção escolhida: ");
        int opcao = scanner.nextInt();

        System.out.println(opcao);

        switch (opcao) {
            case 1:
                personalTaskController.menuPersonalTask();
                break;
            case 2:
                studyTaskController.menuStudyTask();
                break;
            case 3:
                workTaskController.menuWorkTask();
                break;
            default:
                System.out.println("Opção inválida");
        }

        //iniciar o printl em cada caso

        //localdate.plusdays(5);

        //LocalDate diaHoje = LocalDate.now();
        //plus - plusDays(1);
        //minus - minusDays();
    }

    //Projeto final do curso de POOII do Devas

}


