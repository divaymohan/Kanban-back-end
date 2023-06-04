package com.kanban.kanban.service;

import com.kanban.kanban.dto.UserDto;
import com.kanban.kanban.entity.User;
import com.kanban.kanban.mapper.user.UserMapper;
import com.kanban.kanban.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public List<UserDto> getUsers(){
        log.info("Fetching all the users from store.");
        List<User> users = userRepository.findAll();
        return userMapper.getUserDtos(users);
    }

    public UserDto getUser(String userId){
        log.info("Fetching user from store with user id: {}", userId);
        Optional<User> userOptional = userRepository.findById(userId);
        return userOptional.map(user -> userMapper.getUserDto(user))
                .orElse(null);
    }

    public void addUser(UserDto userDto) {
        log.info("Adding user");
        userDto.setUserId(UUID.randomUUID().toString());
        User user = userMapper.getUserEntity(userDto);
        userRepository.save(user);
    }
}
