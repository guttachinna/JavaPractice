package com.task.date19_06_2018;

import java.util.Scanner;

public class DiagonalDifference {
	static int array[][];
	static int sum1=0;
	static int sum2=0;

	
	public int diagonalDiffe(int sum1,int sum2)

{
	return Math.abs(sum1-sum2);
}
		
public void arrayIntialization()
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the Size of an Array:");
	int n=scan.nextInt();
int array[][]=new int[n][n];
for(int i=0;i<n;i++)
{
	System.out.println("Enter "+(i+1)+" row elements");
	for(int j=0;j<n;j++)
	{
		System.out.print("Enter array element :");
		array[i][j]=scan.nextInt();
	}
}
this.array=array;
}

public void sumDiagonal(int  arr[][])
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(i==j)
			{
				sum1=sum1+arr[i][j];
			}
			if(j==arr.length-1-i)
			{
				sum2=sum2+arr[i][j];
			}
		}
	}
	System.out.println(sum1+" "+sum2);
}
	

public static void main(String[] args) {
		DiagonalDifference obj=new DiagonalDifference();
		obj.arrayIntialization();
		obj.sumDiagonal(array);
		
		System.out.println("Absolute Diagonal Difference "+obj.diagonalDiffe(sum1, sum2));
	}

}
