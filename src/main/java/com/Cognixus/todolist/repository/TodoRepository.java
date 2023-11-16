// TodoRepository.java
package com.yourcompany.todolist.repository;

import com.yourcompany.todolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoItem, Long> {
}
