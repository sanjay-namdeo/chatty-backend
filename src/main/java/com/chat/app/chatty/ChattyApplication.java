package com.chat.app.chatty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class ChattyApplication implements CommandLineRunner {

    @Autowired
    private
    StudentRepository studentRepository;

    @Autowired
    private
    DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(ChattyApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Data source is: " + dataSource);
        for (Student student : studentRepository.findAll()) {
            System.out.println("Student : " + student.getName());
        }
    }

}
