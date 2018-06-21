package com.task.date19_06_2018;

import java.util.Arrays;

public class MissingNumberRandom {

	public static void main(String[] args) {
		int array[]=new int[99];
		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*100+1);
		}
		String krish=Arrays.toString(array);
		System.out.println("Missing numbers :");
		for(int i=1;i<=100;i++)
		{
		if(krish.contains(String.valueOf(i)))
		{	
		}
		else
			System.out.print(i+",");
	}

}
}
