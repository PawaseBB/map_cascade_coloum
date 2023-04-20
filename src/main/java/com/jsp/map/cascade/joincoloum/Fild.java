package com.jsp.map.cascade.joincoloum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Fild {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private String fild_name;
	private int no_of_Students;
	@ManyToOne
	@JoinColumn
	private College college;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFild_name() {
		return fild_name;
	}
	public void setFild_name(String fild_name) {
		this.fild_name = fild_name;
	}
	public int getNo_of_Students() {
		return no_of_Students;
	}
	public void setNo_of_Students(int no_of_Students) {
		this.no_of_Students = no_of_Students;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	

}
