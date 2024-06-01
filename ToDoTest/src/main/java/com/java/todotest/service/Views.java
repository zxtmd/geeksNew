package com.java.todotest.service;

import com.java.todotest.Dto.TaskDto;
import com.java.todotest.model.Task;
import com.java.todotest.repository.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Views  {
    private final TaskRepo taskRepo;


    public Views(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }
    public void newTask(TaskDto taskDto){
        Task task = new Task();
        task.setTitle(taskDto.title());
        task.setDescription(taskDto.description());
        task.setCompleted(taskDto.isCompleted());
    }

    public void getAllTasks(TaskDto taskDto){
        Task task = new Task();
        List<Task> tasks = new ArrayList<>();
        task.;


    }
}
