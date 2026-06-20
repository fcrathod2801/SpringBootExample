package io.example.model;


import org.springframework.stereotype.Component;


public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int  id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }





}
