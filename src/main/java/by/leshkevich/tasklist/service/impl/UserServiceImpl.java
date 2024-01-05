package by.leshkevich.tasklist.service.impl;

import by.leshkevich.tasklist.model.user.User;
import by.leshkevich.tasklist.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(long userId, long taskId) {
        return null;
    }

    @Override
    public void delete(long userId) {

    }
}
