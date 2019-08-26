package com.simple.program;

public class print {
	public static void main(String[] args)
	{
		int n=5;
		StringBuffer str=new StringBuffer("");
		int k = n*2;
		for(int i=1;i<=n*n;i++)
		{
			if(i<=n*2)
			{
				str.append(i);
				if(i%n==0)
				{
					str.append("\n");
				}
				else
				{
					str.append("*");
				}
			}
			else
			{
				
				if(i%n==0)
				{
					str.insert(k, i+"\n");
				}
				else
				{
					str.insert(k, i+"*");
				}
				if(i<10)
					k+=2;
				else
					k+=3;
			}
			
		}
		System.out.println(str);}

}
