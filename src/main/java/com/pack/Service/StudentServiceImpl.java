package com.pack.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.DAO.StudentDAO;
import com.pack.Entity.Student;


@Service
public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDao;
	
	@Autowired
	public void setStudentDao(StudentDAO studentDao) {
	this.studentDao = studentDao;
}


	@Override
	public Student saveStu(Student st) {
		
					return studentDao.save(st);
					}
	

	@Override
	public Iterable<Student> ListofStu() {
		
		return studentDao.findAll();
	}


	@Override
	public Optional<Student> getStuById(Integer reg_no) {
		
		return studentDao.findById(reg_no);
	}


	@Override
	public void deleteStu(Integer reg_no) {
		studentDao.deleteById(reg_no);
		
	}


	@Override
	public Student updateStu(Student st) {
		
				
					return studentDao.save(st);
				

	}
	
		
	}