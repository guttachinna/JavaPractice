package com.firstSpring.student;

import java.io.File;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.reflect.FastConstructor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class StudentTest {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(new File("Properties.txt"));
	BeanFactory factory= new XmlBeanFactory(new FileSystemResource("D:\\java\\Ecllips_Data\\SpringApplication\\src\\com\\firstSpring\\student\\StudentConfig.xml"));
	StudentMain student=(StudentMain) factory.getBean("studentBean");
	student.insert(sc.nextLine(),sc.nextLine(),sc.nextLine());
	student.display();
	EmployeeMain empolyee=(EmployeeMain) factory.getBean("employeeBean");
	empolyee.insert(sc.nextLine(), sc.nextLine(), sc.nextLine());
	empolyee.display();
	}

}
