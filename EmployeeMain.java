package com.firstSpring.student;

public class EmployeeMain {
private String eName;
private String id;
private String salary;
void insert(String eName,String id,String salary)
{
	this.eName=eName;
	this.id=id;
	this.salary=salary;
}
void display()
{
	System.out.println("You are inserted Employee details");
	System.out.print("Name\t\t:"+eName+"\n"+"id\t\t:"+id+"\n"+"Salary\t\t:"+salary);
}
}
