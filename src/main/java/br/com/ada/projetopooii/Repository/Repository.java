package br.com.ada.projetopooii.Repository;

import br.com.ada.projetopooii.Domain.BaseTask;

import java.util.List;

public interface Repository<T extends BaseTask> {

    List<T> getAllTasks();

    T getTaskById(int id);

    void addTask(T task);

    void deleteTask(int id);


}


