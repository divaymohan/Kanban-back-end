package com.kanban.kanban.controller;

import com.kanban.kanban.common.constants.UserConstants;
import com.kanban.kanban.dto.UserDto;
import com.kanban.kanban.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = UserConstants.EndPoints.GET_USERS)
    public List<UserDto> getUsers(){
        return userService.getUsers();
    }

    @GetMapping(path = UserConstants.EndPoints.GET_USER)
    public UserDto getUser(@PathVariable("id") String userId){
        return userService.getUser(userId);
    }

    @PostMapping(path = UserConstants.EndPoints.ADD_USER)
    public void addUser(@Valid @RequestBody UserDto userDto){
        userService.addUser(userDto);
    }


}