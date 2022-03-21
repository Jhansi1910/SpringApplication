package com.ashwin.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Marks {
	@Id
	private String email;

	private int maths;
	private int english;
	private int dsp;
	private int mpmc;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getDsp() {
		return dsp;
	}

	public void setDsp(int dsp) {
		this.dsp = dsp;
	}

	public int getMpmc() {
		return mpmc;
	}

	public void setMpmc(int mpmc) {
		this.mpmc = mpmc;
	}

}