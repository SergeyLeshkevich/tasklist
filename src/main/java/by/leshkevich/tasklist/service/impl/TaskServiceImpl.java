package by.leshkevich.tasklist.service.impl;

import by.leshkevich.tasklist.model.task.Task;
import by.leshkevich.tasklist.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Task getById(long taskId) {
        return null;
    }

    @Override
    public List<Task> getAllByUserId(long userId) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task create(Task task,Long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
