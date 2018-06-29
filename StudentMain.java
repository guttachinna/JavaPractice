package com.firstSpring.student;

public class StudentMain {
private String name;
private String barnch;
private String percentage;
void insert(String name,String branch,String percentage)
{
	this.name=name;
	this.barnch=branch;
	this.percentage=percentage;
}
void display()
{
	System.out.println("You are inserted Student details");
	System.out.println("Name\t\t:"+name+"\n"+"branch \t\t:"+barnch+"\n"+"Percentage\t:"+percentage+"\n\n");
}
}
