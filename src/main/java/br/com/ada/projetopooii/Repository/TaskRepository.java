package br.com.ada.projetopooii.Repository;

import br.com.ada.projetopooii.Domain.BaseTask;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository<T extends BaseTask> implements Repository<T> {

    List<T> tasks = new ArrayList<>();

    @Override
    public List<T> getAllTasks() {
        return tasks;
    }

    @Override
    public T getTaskById(int id) {
        for (T task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    @Override
    public void addTask(T task) {
        tasks.add(task);
    }

    @Override
    public void deleteTask(int id) {
        T taskDelete = null;
        for (T task : tasks) {
            if (task.getId() == id) {
                taskDelete = task;
                break;
            }
        }

        if ( taskDelete != null){
            tasks.remove(taskDelete);
        }
    }
}
