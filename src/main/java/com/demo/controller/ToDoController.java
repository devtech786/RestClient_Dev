package com.demo.controller;

import com.demo.model.InvoiceRequest;
import com.demo.model.Todo;
import com.demo.service.FbrService;
import com.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private FbrService fbrService;


    @GetMapping("/{id}")
    public Todo getSingleTodo(@PathVariable ("id") int id){
      return this.todoService.getTodo(id);
    }

    @GetMapping
    public List<Todo> getSingleTodo(){
        return this.todoService.getAllTodo();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){
       return this.todoService.createTodo(todo);
    }

    @PostMapping("/sendInvoice")
    public String sendInvoice(@RequestBody InvoiceRequest invoiceRequest){
        return fbrService.sendInvoiceToFbr(invoiceRequest);
    }

}
