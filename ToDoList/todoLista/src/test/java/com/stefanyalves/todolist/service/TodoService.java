package com.stefanyalves.todolist.service;

import com.stefanyalves.todolist.entity.Todo;
import com.stefanyalves.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    // Criar um novo Todo
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    // Listar todos os Todos ordenados por prioridade e nome
    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    // Atualizar um Todo
    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    // Deletar um Todo
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
