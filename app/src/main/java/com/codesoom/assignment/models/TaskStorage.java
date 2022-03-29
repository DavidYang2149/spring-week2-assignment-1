package com.codesoom.assignment.models;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private final List<Task> tasks = new ArrayList<>();
    private Long newId = 0L;

    public List<Task> list() {
        return tasks;
    }

    public Task create(Task task) {
        if (task.getTitle().isBlank()) {
            // TODO error...
        }

        task.setId(generateId());
        tasks.add(task);
        return task;
    }

    /**
     * 오름차순으로 증가하는 Id를 만듭니다.
     * @return newId
     */
    private Long generateId() {
        newId += 1;
        return newId;
    }
}
