package com.deepspace.datatracker.controller;

import com.deepspace.datatracker.controller.api.CRUDController;
import com.deepspace.datatracker.model.entity.Comment;
import com.deepspace.datatracker.service.api.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentControllerImpl implements CRUDController<Comment, Comment> {

    private final CommentService commentService;

    @Override
    public List<Comment> getAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Comment getById(UUID id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(UUID id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Comment create(Comment dto) {
        throw new UnsupportedOperationException();
    }
}
