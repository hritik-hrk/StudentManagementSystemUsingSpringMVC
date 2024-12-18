package com.jsp.spring_mvc.studentdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc.studentdb.entity.Student;
import com.jsp.spring_mvc.studentdb.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/add-student",method = RequestMethod.POST )
	public ModelAndView addStudent(Student student) {

		return studentService.addStudent(student);


	}
	@RequestMapping(value = "/DISPLAY-ALL-STUDENT",method = RequestMethod.GET)
	public ModelAndView displayALLStudent() {

		return studentService.displayALLStudent();


	}

	@RequestMapping(value = "/find-student-by-ID",method = RequestMethod.GET)
	public ModelAndView UpdateStudentByID(@RequestParam int studentID) {
		
		return studentService.UpdateStudentByID(studentID);

	}
	
	@RequestMapping(value = "/save-updated-student",method = RequestMethod.POST)
	public ModelAndView UpdateStudent(Student student) {
		return studentService.UpdateStudent(student);
		
		
	}
	
	
	@RequestMapping(value = "/delete-student-by-ID",method = RequestMethod.GET)
	public ModelAndView DeleteStudentByID(@RequestParam int studentID) {
		return studentService.DeleteStudentByID(studentID);
		
	}

	

	@RequestMapping(value = "/save-deleted-student",method = RequestMethod.POST)
	public ModelAndView DeleteStudent(Student student) {
		return studentService.DeleteStudent(student);
		
	}

}
