package com.task.date19_06_2018;

public class BirthDayCandle {
	  public int birthdayCakeCandles(int[] arr) {
	        int max=arr[0];int temp=0;int count=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(max<arr[i])
	            {
	                temp=max;
	                max=arr[i];
	                arr[i]=temp;
	            }
	        }
	        for(int i=0;i<arr.length;i++)
	        {
	            if(max==arr[i])
	            {
	                count++;
	            }
	        }
	    return count;
	    }

	public static void main(String[] args) {
		int arra[]= {4,3,2,1,4};
		BirthDayCandle obj=new BirthDayCandle();
		System.out.println("He/She can able to blow :"+obj.birthdayCakeCandles(arra)+" candles");
	}

}
