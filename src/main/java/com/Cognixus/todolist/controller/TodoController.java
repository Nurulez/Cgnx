// TodoController.java
package com.yourcompany.todolist.controller;

import com.yourcompany.todolist.model.TodoItem;
import com.yourcompany.todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<TodoItem> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public TodoItem getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public TodoItem addTodo(@RequestBody TodoItem todoItem) {
        return todoService.addTodo(todoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }

    @PutMapping("/complete/{id}")
    public TodoItem markTodoAsCompleted(@PathVariable Long id) {
        return todoService.markTodoAsCompleted(id);
    }
}
