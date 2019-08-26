package com.seimens;

public class AddTwoStringIntegersTest {

	public static void main(String[] args) throws NumberFormatException{
		
		String s1="580";
		String s2="820";
		StringBuffer sb=new StringBuffer();
		int reminder=0,sum=0;
		
		for(int i=s1.length()-1,j=s2.length()-1;i>=0||j>=0;i--,j--) {
			int c1=0,c2=0;
			sum=0;
			
			if(i>=0) {
			c1=Integer.parseInt(String.valueOf(s1.charAt(i)));
			//sum=sum+c1;
			}
			
			if(j>=0) {
			c2=Integer.parseInt(String.valueOf(s2.charAt(j)));
			//sum=sum+c2;
			}
			sum=c1+c2;
			int number=0;
			if(sum>=10) {
				sum=sum+reminder;
				number=sum%10;
				reminder=sum/10;
				
			}else if (reminder>0 && number <10){
				number=sum+reminder;
				reminder=0;
			}else {
				number=sum;
			}
			
			sb.append(number);
		}
		if(sum>=10) {
			sb.append(reminder);
		}
		System.out.println(sb.reverse().toString());

		
	}

}
