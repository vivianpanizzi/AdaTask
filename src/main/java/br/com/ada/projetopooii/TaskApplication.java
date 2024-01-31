package br.com.ada.projetopooii;

import br.com.ada.projetopooii.Controller.PersonalTaskController;
import br.com.ada.projetopooii.Controller.StudyTaskController;
import br.com.ada.projetopooii.Controller.WorkTaskController;
import br.com.ada.projetopooii.Domain.PersonalTask;
import br.com.ada.projetopooii.Domain.StudyTask;
import br.com.ada.projetopooii.Domain.WorkTask;
import br.com.ada.projetopooii.Repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<PersonalTask> personalTasks = new ArrayList<>();

        TaskRepository<PersonalTask> personalTaskRepository = new TaskRepository<>();
        TaskRepository<StudyTask> studyTaskRepository = new TaskRepository<>();
        TaskRepository<WorkTask> workTaskRepository = new TaskRepository<>();

        PersonalTaskController personalTaskController = new PersonalTaskController(personalTaskRepository);
        StudyTaskController studyTaskController = new StudyTaskController(studyTaskRepository);
        WorkTaskController workTaskController = new WorkTaskController(workTaskRepository);

        System.out.println("--------   Task    --------");
        System.out.println("---------------------------");


        System.out.println("\n"+"--------   Menu    --------");
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

        //localdate.plusdays(5);

        //LocalDate diaHoje = LocalDate.now();
        //plus - plusDays(1);
        //minus - minusDays();
    }

}


