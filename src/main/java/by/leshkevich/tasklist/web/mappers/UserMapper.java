package by.leshkevich.tasklist.web.mappers;

import by.leshkevich.tasklist.model.user.User;
import by.leshkevich.tasklist.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto dto);
}
