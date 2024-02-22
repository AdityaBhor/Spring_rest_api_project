package com.example.springrestapi2.service;


import com.example.springrestapi2.dao.StudentsDao;
import com.example.springrestapi2.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    StudentsDao studentDao;

    public Students addStudents(Students student){
        return studentDao.save(student);
    }


    public Students updateStudents(Students student) {
        return studentDao.save(student);
    }

    public void  deleteStudents(Students student) {
        studentDao.delete(student);
    }

    public List<Students> getAllStudents() {
        return (List<Students>) studentDao.findAll();
    }

}
