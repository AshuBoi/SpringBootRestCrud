package com.AshuBoi.SpringBootRestCrud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","AshuBoi"),
                new Course(2,"LearnDevops","AshuBoi"),
                new Course(3,"LearnEureka","AshuBoi")
        );
    }
}
