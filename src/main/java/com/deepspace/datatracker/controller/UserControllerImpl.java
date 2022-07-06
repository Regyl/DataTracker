package com.deepspace.datatracker.controller;

import com.deepspace.datatracker.controller.api.CRUDController;
import com.deepspace.datatracker.model.entity.User;
import com.deepspace.datatracker.service.api.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserControllerImpl implements CRUDController<User, User> {

    private final UserService userService;

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public User getById(UUID id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(UUID id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User create(User dto) {
        throw new UnsupportedOperationException();
    }
}
