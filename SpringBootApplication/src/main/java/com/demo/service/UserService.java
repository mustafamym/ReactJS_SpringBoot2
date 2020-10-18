package com.demo.service;


import com.demo.dto.UserDto;
import com.demo.entity.User;

import java.util.List;


public interface UserService {

    User save(UserDto user);

    List<User> findAll();

    void delete(Long id);

    User findOne(String username);

    User findById(Long id);

    UserDto update(UserDto userDto);
}
