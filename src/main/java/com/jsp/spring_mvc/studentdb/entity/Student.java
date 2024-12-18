package com.jsp.spring_mvc.studentdb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentID;
	private String studentNAME;
	private String studentEMAIL;
	private int studentAGE;
	private String studentCOURSE;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentNAME() {
		return studentNAME;
	}
	public void setStudentNAME(String studentNAME) {
		this.studentNAME = studentNAME;
	}
	public String getStudentEMAIL() {
		return studentEMAIL;
	}
	public void setStudentEMAIL(String studentEMAIL) {
		this.studentEMAIL = studentEMAIL;
	}
	public int getStudentAGE() {
		return studentAGE;
	}
	public void setStudentAGE(int studentAGE) {
		this.studentAGE = studentAGE;
	}
	public String getStudentCOURSE() {
		return studentCOURSE;
	}
	public void setStudentCOURSE(String studentCOURSE) {
		this.studentCOURSE = studentCOURSE;
	}

	
	
	
}
