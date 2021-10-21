package com.gfa.exam;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListTasks {
    private ArrayList<Todo> todos;
    private String filename;

    public ListTasks(String filename) {
        this.filename = filename;
        todos = new ArrayList<>();
    }

    public void add(Todo todo) {
        todos.add(todo);
    }

    public String dataStored() {
        Path filePath = Paths.get(filename);
        List<String> lines;
        try {
            lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println((i + 1) + " - " + lines.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ("File not found");
        }
        return lines.toString();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < todos.size(); i++) {
            result += (i + 1) + ". " + todos.get(i) + "\n";
        }
        return result;
    }
}
