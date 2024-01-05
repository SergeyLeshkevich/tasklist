package by.leshkevich.tasklist.repository.impl;

import by.leshkevich.tasklist.model.user.Role;
import by.leshkevich.tasklist.model.user.User;
import by.leshkevich.tasklist.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public Optional<User> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByUsername(String name) {
        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void insertUserRole(long userId, Role role) {

    }

    @Override
    public boolean isTaskOwner(long userId, long taskId) {
        return false;
    }

    @Override
    public void delete(long userId) {

    }
}
