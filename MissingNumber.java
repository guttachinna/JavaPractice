package com.task.date19_06_2018;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MissingNumber {

	public static void main(String[] args) {
		int sum1=0;int sum2=0;
		int array[]=new int[99];
		for(int j=0;j<array.length;j++)
		{
			if(j!=95-1)
				array[j]=j+1;
			else
				array[j]=100;
		}
		for(int i=0;i<array.length;i++)
		{
			sum2=sum2+array[i];
		}
		System.out.println(5050-sum2);
	}

}
