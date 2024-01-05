package by.leshkevich.tasklist.service;

import by.leshkevich.tasklist.model.user.User;

public interface UserService {
    User getById(long id);
    User getByUsername(String username);
    User update(User user);
    User create(long userId, long taskId);
    void delete(long userId);
}
