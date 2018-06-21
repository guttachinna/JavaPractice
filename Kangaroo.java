package com.task.date19_06_2018;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		String meet="No";
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first kangaroo postion :");
		int x1=scan.nextInt();
		System.out.print("Enter first kangaroo Jump Distence :");
		int v1=scan.nextInt();
		System.out.print("Enter Second kangaroo postion :");
		int x2=scan.nextInt();
		System.out.print("Enter Second kangaroo Jump Distence  :");
		int v2=scan.nextInt();
		if(x1<x2&&v1<v2)
		{
			meet="No";
		}
		else
		for(int i=0;i<50;i++)
		{
			x1=x1+v1;
			x2=x2+v2;
			if(x1==x2)
			{
				meet="yes";
			}
		}
		System.out.print("Is both kangaroos land in same location :");
		System.out.print(meet);

	}

}
