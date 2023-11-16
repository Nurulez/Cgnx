// TodoService.java
package com.yourcompany.todolist.service;

import com.yourcompany.todolist.model.TodoItem;

import java.util.List;

public interface TodoService {
    List<TodoItem> getAllTodos();

    TodoItem getTodoById(Long id);

    TodoItem addTodo(TodoItem todoItem);

    void deleteTodo(Long id);

    TodoItem markTodoAsCompleted(Long id);
}
