package com.gfa.exam;

public class Todo {
    private String name;
    private boolean completed;

    public Todo(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }
}

