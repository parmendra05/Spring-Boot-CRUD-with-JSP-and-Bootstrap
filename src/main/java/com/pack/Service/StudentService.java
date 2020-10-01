package com.pack.Service;

import java.util.Optional;

import com.pack.Entity.Student;



public interface StudentService {
	public Iterable<Student> ListofStu();
	public Student saveStu(Student st);
	public  Optional<Student> getStuById(Integer reg_no );
	public void deleteStu(Integer reg_no);
	public Student updateStu(Student st);
}
