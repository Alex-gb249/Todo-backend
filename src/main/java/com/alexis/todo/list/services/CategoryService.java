package com.alexis.todo.list.services;

import com.alexis.todo.list.models.Category;
import com.alexis.todo.list.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Boolean delete(Long id) {
        try {
            categoryRepository.deleteById(id);
            return Boolean.TRUE;
        } catch (Exception e) {
            System.out.println("Error al eliminar: "+e);
            return Boolean.FALSE;
        }
    }
}