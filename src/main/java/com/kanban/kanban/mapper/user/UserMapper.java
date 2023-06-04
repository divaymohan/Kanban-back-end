package com.kanban.kanban.mapper.user;

import com.kanban.kanban.dto.UserDto;
import com.kanban.kanban.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMapper {

    @Autowired
    private ModelMapper modelMapper;

    public User getUserEntity(UserDto userDto){
        return modelMapper.map(userDto, User.class);
    }

    public UserDto getUserDto(User user){
        return modelMapper.map(user, UserDto.class);
    }

    public List<User> getUserEntities(List<UserDto> userDtos){
        return userDtos.stream()
                .map(this::getUserEntity)
                .collect(Collectors.toList());
    }

    public List<UserDto> getUserDtos(List<User> users){
        return users.stream()
                .map(this::getUserDto)
                .collect(Collectors.toList());
    }
}
