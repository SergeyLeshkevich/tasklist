package by.leshkevich.tasklist.repository;

import by.leshkevich.tasklist.model.user.Role;
import by.leshkevich.tasklist.model.user.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id);
    Optional<User> findByUsername(String name);
    void update(User user);
    void create(User user);
    void insertUserRole(long userId, Role role);
    boolean isTaskOwner(long userId,long taskId);
    void delete(long userId);
}
