package com.springcore.springjdbc.dao;

import java.util.List;

import com.springcore.springjdbc.entities.Student;

public interface StudentDao {

	int insertStudent(Student student);
	
	int updateStudent(Student student);
	
	int deleteStudent(int studentId);
	
	Student getStudentById(int studentId);
	
	List<Student> getAllStudents();
}
