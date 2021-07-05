package com.valerijovich.springrestjsonresponseexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

    @Value("${app.name:Default Demo App}")
    private String appName;

    @GetMapping("/get")
    public StudentResponse getStudent () {
        return new StudentResponse(1, "John", "Smith");
    }
}