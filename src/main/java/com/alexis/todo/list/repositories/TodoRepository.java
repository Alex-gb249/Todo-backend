package com.alexis.todo.list.repositories;

import com.alexis.todo.list.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
