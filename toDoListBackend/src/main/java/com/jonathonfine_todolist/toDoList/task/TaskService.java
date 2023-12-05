package com.jonathonfine_todolist.toDoList.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // GET METHODS
    public List<Task> getAllTasks(){
        List<Task> tasks = new ArrayList<>();

        taskRepository.findAll().forEach(tasks::add);

        return tasks;
    }

    public Task getTaskByName(String name) {
        return taskRepository.findTaskByTaskName(name);
    }

    // POST & PUT METHOD
    public void createNewTask(Task task){
        taskRepository.save(task);
    }

    public void updateTask(Task task) {taskRepository.save(task);}

    // DELETE METHOD
    public void delete(Task task){
        taskRepository.delete(task);
    }

}
