package com.alexis.todo.list.services;

import com.alexis.todo.list.models.Todo;
import com.alexis.todo.list.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    public Boolean delete(Long id) {
        try {
            todoRepository.deleteById(id);
            return Boolean.TRUE;
        } catch (Exception e) {
            System.out.println("Error al eliminar: "+e);
            return Boolean.FALSE;
        }
    }
}
