package com.java.todotest.controller;

import com.java.todotest.Dto.TaskDto;
import com.java.todotest.service.Views;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TaskController {
    private final Views views;


    public TaskController(Views views) {
        this.views = views;
    }
    @PostMapping("/add-task")
    public ResponseEntity<String> addTask (@RequestBody TaskDto taskDto){
        views.newTask(taskDto);
        return ResponseEntity.ok("Задача добавлена");
    }
}
