package com.digisene.taskmanagement;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan("com.digisene.taskmanagement.entity")
public class TaskManagementApplication {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.load();

        dotenv.entries().forEach(entry->System.setProperty(entry.getKey(), entry.getValue()));

        SpringApplication.run(TaskManagementApplication.class, args);
    }

}
