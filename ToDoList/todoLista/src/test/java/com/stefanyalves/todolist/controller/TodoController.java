package com.stefanyalves.todolist.controller;

import com.stefanyalves.todolist.entity.Todo;
import com.stefanyalves.todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import com.stefanyalves.todolist.entity.Todo;
import com.stefanyalves.todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    // Criar um novo Todo
    @PostMapping
    public List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }

    // Atualizar um Todo existente
    @PutMapping
    public List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }

    // Listar todos os Todos
    @GetMapping
    public List<Todo> list(){
        return todoService.list();
    }

    // Deletar um Todo pelo ID
    @DeleteMapping("/{id}")
    public List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
