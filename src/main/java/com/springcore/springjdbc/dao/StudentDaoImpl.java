package com.springcore.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springcore.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int insertStudent(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int result = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}

	@Override
	public int updateStudent(Student student) {
		String query = "update student set name=?, city=? where id=?";
		return jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
	}

	@Override
	public int deleteStudent(int studentId) {
		String query = "DELETE from student where id=?";
		return jdbcTemplate.update(query,studentId);
	}

	@Override
	public Student getStudentById(int studentId) {
		String query = "SELECT * FROM student WHERE id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String query = "SELECT * FROM student";
		List<Student> students = jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

}
