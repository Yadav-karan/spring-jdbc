package com.springcore.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.springjdbc.dao.StudentDao;
import com.springcore.springjdbc.dao.StudentDaoImpl;
import com.springcore.springjdbc.entities.Student;

public class Client {

	public static void main(String[] args) {
		System.out.println("Program Started....................");
		
		// xml configuration
//		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/springcore/springjdbc/springjdbc.xml");		 
		 
		
		//Java Config
		ApplicationContext cxt = new AnnotationConfigApplicationContext(JavaConfig.class);
		StudentDao studentDao = cxt.getBean("studentDao",StudentDaoImpl.class); 
		
//		 Student student = new Student();
//		 student.setId(111);
//		 student.setCity("Mumbai");
//		 student.setName("Sujeet Maurya");
//		 
//		 int result = studentDao.insertStudent(student);
//		 System.out.println("Student Added: "+result);
		 
//		 
//		 Student updateStudent = new Student();
//		 updateStudent.setId(111);
//		 updateStudent.setCity("Banglore");
//		 updateStudent.setName("Amandeep");
//		 int updateResult = studentDao.updateStudent(updateStudent);
//		 System.out.println("Student Updated: "+updateResult);
		 
//		 int deleteResult = studentDao.deleteStudent(111);
//		 System.out.println("Number of student deleted: "+deleteResult);
//		 
//		 Student student = studentDao.getStudentById(101);
//		 System.out.println(student);
//		 
		 List<Student> students = studentDao.getAllStudents();
		 for(Student s: students) {
			 System.out.println(s);
		 }
	}

}
