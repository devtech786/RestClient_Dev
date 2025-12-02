package com.demo.controller;

import com.demo.model.Todo;
import com.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class ToDoController {

    @Autowired
    private TodoService todoService;
    @GetMapping("/{id}")
    public Todo getSingleTodo(@PathVariable ("id") int id){
      return this.todoService.getTodo(id);
    }
}
