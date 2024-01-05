package by.leshkevich.tasklist.web.controller;

import by.leshkevich.tasklist.model.task.Task;
import by.leshkevich.tasklist.service.TaskService;
import by.leshkevich.tasklist.web.dto.task.TaskDto;
import by.leshkevich.tasklist.web.dto.validation.OnUpdate;
import by.leshkevich.tasklist.web.mappers.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tasks")
@Validated
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    @PutMapping
    public TaskDto update(@Validated(OnUpdate.class) TaskDto dto) {
        Task task = taskMapper.toEntity(dto);
        Task returnedTask = taskService.update(task);
        return taskMapper.toDto(returnedTask);
    }

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id) {
        Task task = taskService.getById(id);
        return taskMapper.toDto(task);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        taskService.delete(id);
    }
}
