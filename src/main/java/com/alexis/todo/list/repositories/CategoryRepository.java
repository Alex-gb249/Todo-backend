package com.alexis.todo.list.repositories;

import com.alexis.todo.list.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
