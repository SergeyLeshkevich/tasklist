package by.leshkevich.tasklist.service;

import by.leshkevich.tasklist.model.task.Task;

import java.util.List;

public interface TaskService {
    Task getById(long taskId);

    List<Task> getAllByUserId(long userId);

    Task update(Task task);

    Task create(Task task,Long id);

    void delete(long id);
}
