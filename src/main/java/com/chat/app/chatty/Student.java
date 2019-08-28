package com.chat.app.chatty;

import javax.persistence.*;

@Entity
public class Student {
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " | " + name;
    }
}

// CREATE TABLE STUDENT(id INT NOT NULL AUTO_INCREMENT key, name VARCHAR(100) NOT NULL);
