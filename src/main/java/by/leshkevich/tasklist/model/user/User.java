package by.leshkevich.tasklist.model.user;

import by.leshkevich.tasklist.model.task.Task;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class User {

    private long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;
    private Set<Role> roles;
    private List<Task> tasks;

}
