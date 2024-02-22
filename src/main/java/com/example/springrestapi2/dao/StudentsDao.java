package com.example.springrestapi2.dao;


import com.example.springrestapi2.model.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsDao extends CrudRepository<Students,Integer> {
}
