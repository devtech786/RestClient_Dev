package com.demo.service;

import com.demo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import java.util.List;
@Service
public class TodoService {

    @Autowired
    private RestClient restClient;
//single
    public Todo getTodo(int id){
      Todo body=  restClient.get().uri("/todos/{id}",id).retrieve().body(Todo.class);

      return body;
    }

    //list todo
    public List<Todo> getAllTodo(){
        return restClient.get().uri("/todos").retrieve().body(List.class);
    }

    //create post

    public Todo createTodo(Todo todo){
     return    restClient.post().uri("/todos").contentType(MediaType.APPLICATION_JSON).body(todo)
                .retrieve().body(Todo.class);
    }
}
