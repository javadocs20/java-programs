package com.simple.program;

public class print1 {
	public static void main(String[] args)
	{
		int n=3;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n/2+1 && i!=0)
					System.out.print(i);
				else
					System.out.print(n);
			}
			System.out.println();
		}
	}
}
