package com.jsp.spring_mvc.studentdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc.studentdb.entity.Student;
import com.jsp.spring_mvc.studentdb.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public ModelAndView addStudent(Student student) {
		studentRepository.addStudent(student);

		//ModelAndView andView = new ModelAndView();
		//andView.setViewName("index.jsp");

		return new ModelAndView("index.jsp");

	}

	public ModelAndView displayALLStudent() {
		List<Student> students = studentRepository.displayALLStudent();

//		ModelAndView andView = new ModelAndView();
//		andView.setViewName("DisplayAllStudent.jsp");
//		andView.addObject("studentList", students);

		return new ModelAndView("DisplayAllStudent.jsp").addObject("studentList",students);

	}

	public ModelAndView UpdateStudentByID(int studentID) {

		// fetching the data based on student object on id

		Student student = studentRepository.FindstudentByID(studentID);

		ModelAndView andView = new ModelAndView();
		andView.setViewName("UpdateStudent.jsp");
		andView.addObject("studentObject", student);

		return andView;
	}
	
	public ModelAndView UpdateStudent(Student student) {
		studentRepository.UpdateStudent(student);
		
		
//		ModelAndView andView = new ModelAndView();
//		andView.setViewName("redirect:DISPLAY-ALL-STUDENT");
		return new ModelAndView("redirect:/DISPLAY-ALL-STUDENT");
		
	}
	
	
	public ModelAndView DeleteStudentByID(int studentID) {
		
		Student student = studentRepository.DeleteStudentByID(studentID);
		
		return new ModelAndView("DeleteStudent.jsp").addObject("studentObjectdelete",student);
		
		
	}
	
	public ModelAndView DeleteStudent(Student student) {
		studentRepository.DeleteStudent(student);
		return new ModelAndView("redirect:/DISPLAY-ALL-STUDENT");
	}
	
	
	
}
