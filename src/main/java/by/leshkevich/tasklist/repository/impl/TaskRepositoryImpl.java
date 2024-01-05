package by.leshkevich.tasklist.repository.impl;

import by.leshkevich.tasklist.model.task.Task;
import by.leshkevich.tasklist.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {
    @Override
    public Optional<Task> findById(long taskId) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUserId(long userId) {
        return null;
    }

    @Override
    public void assignToUserById(long taskId, long userId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(long taskId) {

    }
}
