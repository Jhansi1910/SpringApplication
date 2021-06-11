package com.ashwin.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Details {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  
  private Integer id;

  private String name;

  private String email;
  
  private String firstName;

  private String surname;
  private int age;
  private int year;

  public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}