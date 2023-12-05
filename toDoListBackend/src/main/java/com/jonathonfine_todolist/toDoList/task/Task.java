package com.jonathonfine_todolist.toDoList.task;

import jakarta.persistence.*;

@Table(name="to_do_list")
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name="task_name", nullable = false)
    private String taskName;

    @Column(name="description", nullable = true)
    private String description;

    // Maybe refactor to use the 'this()' constructor
    public Task(String id, String taskName, String description) {
        this.id = id;
        this.taskName = taskName;
        this.description = description;
    }

    public Task(String taskName, String description) {
        this.taskName = taskName;
        this.description = description;
    }

    public Task() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
