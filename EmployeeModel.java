package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "employee")
public class EmployeeModel {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "empId")
  private Integer empId;
  
  @Column(name = "empName")
  private String empName;
  
  @Column(name = "empSalary")
  private Integer empSalary;

public Integer getEmpId() {
	return empId;
}

public void setEmpId(Integer empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public Integer getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(Integer empSalary) {
	this.empSalary = empSalary;
}

}