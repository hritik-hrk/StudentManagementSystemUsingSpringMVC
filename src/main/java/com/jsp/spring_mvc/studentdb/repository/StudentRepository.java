package com.jsp.spring_mvc.studentdb.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc.studentdb.entity.Student;

@Repository
public class StudentRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");

	public void addStudent(Student student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		em.persist(student);

		et.commit();
		em.close();

	}

	public List<Student> displayALLStudent() {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Query query = em.createQuery("FROM Student");
		List<Student> students = query.getResultList();

		et.commit();
		em.close();

		return students;

	}

	public int UpdateStudentByID(int studentID) {

		// fetch the data by id
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		em.find(Student.class, studentID);

		et.commit();
		em.close();

		return studentID;

	}

	public Student FindstudentByID(int studentID) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Student student = em.find(Student.class, studentID);

		et.commit();
		em.close();

		return student;

	}
	
	public void UpdateStudent(Student student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.merge(student);
		
		et.commit();
		em.close();

		
	}
	
	public Student DeleteStudentByID(int studentID) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Student student = em.find(Student.class,studentID);
		em.remove(student);
		
		et.commit();
		em.close();

		return student;
		
	}

	public void DeleteStudent(Student student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
	
	

		et.commit();
		em.close();
	}
}
