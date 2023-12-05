package com.jonathonfine_todolist.toDoList.task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

    public Task findTaskByTaskName(String name);



}
