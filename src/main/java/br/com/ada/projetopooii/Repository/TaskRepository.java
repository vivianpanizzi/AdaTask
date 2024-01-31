package br.com.ada.projetopooii.Repository;

import br.com.ada.projetopooii.Domain.BaseTask;

import java.util.List;

public class TaskRepository<T extends BaseTask> implements Repository<T> {
    @Override
    public List<T> getAllTasks() {
        return null;
    }

    @Override
    public T getTaskById(int id) {
        return null;
    }

    @Override
    public void addTask(BaseTask task) {

    }

    @Override
    public void deleteTask(int id) {

    }
}
