package com.array;

public class SumOfNumbers {

	public static void main(String[] args) {
	
		int n=125;
		int q,sum=0;
		while(n>0) {
			q=n%10;
			n=n/10;
			sum=sum+q;
		}
		System.out.println(sum);
	}

}
