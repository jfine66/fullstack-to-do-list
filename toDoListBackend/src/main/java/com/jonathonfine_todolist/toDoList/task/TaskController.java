package com.jonathonfine_todolist.toDoList.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> getAllTask(){
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{name}")
    public Task getTaskByName(@PathVariable String name) {
        return taskService.getTaskByName(name);
    }

    @PostMapping("/tasks")
    public void createNewTask(@RequestBody Task task){
        taskService.createNewTask(task);
    }

    @PutMapping("/tasks/{name}")
    public void updateTask(@PathVariable String name){
        Task taskToUpdate = getTaskByName(name);

        taskService.updateTask(taskToUpdate);
    }

    @DeleteMapping("/tasks/{name}")
    public void deleteTask(@PathVariable String name){
        Task taskToDelete = getTaskByName(name);

        taskService.delete(taskToDelete);
    }

}
