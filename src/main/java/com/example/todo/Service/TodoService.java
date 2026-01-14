package com.example.todo.Service;

import com.example.todo.Entity.Todo;
import com.example.todo.Repository.TodoRepository;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> index() {
        return todoRepository.findAll();
    }
}
