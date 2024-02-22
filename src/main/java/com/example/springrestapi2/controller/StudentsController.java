package com.example.springrestapi2.controller;


import com.example.springrestapi2.model.Students;
import com.example.springrestapi2.service.StudentsService;
import com.example.springrestapi2.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentsController {

    @Autowired
    StudentsService studentsService;

    @PostMapping
    public Students addStudents(@RequestBody Students student){
        return studentsService.addStudents(student);
    }
    @PutMapping
    public Students updateStudents(@RequestBody Students student){
        return studentsService.updateStudents(student);
    }
    @DeleteMapping
    public void deleteStudents(@RequestBody Students student){
       studentsService.deleteStudents(student);
    }

    @GetMapping
    public List<Students> getAllStudents(){
        return studentsService.getAllStudents();
    }

}



