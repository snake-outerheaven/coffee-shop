package com.sei133.todo.todo_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

        @GetMapping("/")
        public String home() {
                return "Hello Spring Boot!";
        }
}