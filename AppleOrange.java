package com.task.date19_06_2018;

import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int apples=0;int oranges=0;
		System.out.println("Enter the house positions s(start) and t(end) values");
		System.out.print("s=");
		int s=scan.nextInt();
		System.out.print("t=");
		int t=scan.nextInt();
		System.out.println("Enter the apple tree position");
		System.out.print("a=");
		int a=scan.nextInt();
		System.out.println("Enter the orange tree position");
		System.out.print("b=");
		int b=scan.nextInt();
		System.out.println("Enter the NO.of apples fell down");
		System.out.print("m=");
		int m=scan.nextInt();
		System.out.println("Enter the NO.of Oranges fell down");
		System.out.print("n=");
		int n=scan.nextInt();
		System.out.println("Enter the postions of apples");
		int apple[]=new int[m];
		for(int i=0;i<apple.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" apple position");
			apple[i]=scan.nextInt();
		}
		System.out.println("Enter the postions of oranges");
		int orange[]=new int[n];
		for(int i=0;i<orange.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" orange position :");
			orange[i]=scan.nextInt();
		}
		for(int i=0;i<apple.length;i++)
		{
			if(a+apple[i]>=s&&a+apple[i]<=t)
			{
				apples++;
			}
		}
		for(int i=0;i<orange.length;i++)
		{
			if((b+orange[i])>=s&&(b+orange[i])<=t)
			{
				oranges++;
			}
		}
		System.out.println("Number of apples that fall on Sam's house= "+apples);
		System.out.println("Number of oranges that fall on Sam's house= "+oranges);

	}

}
