package com.pack.DAO;

import org.springframework.data.repository.CrudRepository;

import com.pack.Entity.Student;



public interface StudentDAO extends CrudRepository<Student, Integer>{

}
