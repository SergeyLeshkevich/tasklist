package by.leshkevich.tasklist.web.mappers;

import by.leshkevich.tasklist.model.task.Task;
import by.leshkevich.tasklist.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto dto);

}
