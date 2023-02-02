package com.alexis.todo.list.controllers;

import com.alexis.todo.list.models.Todo;
import com.alexis.todo.list.repositories.TodoRepository;
import com.alexis.todo.list.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<Todo> save(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.save(todo));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Todo>> getAll() {
        return ResponseEntity.ok(todoService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return ResponseEntity.ok(todoService.delete(id));
    }
}
