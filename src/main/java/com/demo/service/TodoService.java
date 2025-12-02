package com.demo.service;

import com.demo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class TodoService {

    @Autowired
    private RestClient restClient;

    public Todo getTodo(int id){
      Todo body=  restClient.get().uri("/todos/{id}",id).retrieve().body(Todo.class);

      return body;
    }
}
