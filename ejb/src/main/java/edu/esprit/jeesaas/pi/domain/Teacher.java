package edu.esprit.jeesaas.pi.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Teacher
 * 
 */
@Entity
public class Teacher implements Serializable {

	private int idTeacher;
	private String nameTeacher;
	private static final long serialVersionUID = 1L;

	public Teacher() {
		super();
	}

	@Id
	public int getIdTeacher() {
		return this.idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getNameTeacher() {
		return this.nameTeacher;
	}

	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}

}
