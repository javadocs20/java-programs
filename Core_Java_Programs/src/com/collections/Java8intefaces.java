package com.collections;

interface MyInterface{ 
	
	default void newMethod(){  
        System.out.println("Newly added default method");  
    }
	void existingMethod(String str);
}

interface MyInterface2{  
	 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void disp(String str);  
} 
public class Java8intefaces implements MyInterface,MyInterface2{

	public static void main(String[] args) {
		Java8intefaces obj=new Java8intefaces();
		obj.existingMethod("Java 8 is easy to learn");
		obj.newMethod();

	}

	@Override
	public void existingMethod(String str) {
		 System.out.println("String is: "+str); 
		
	}
	 public void disp(String str){
	    	System.out.println("String is: "+str); 
	    }
	//Implementation of duplicate default method
	    public void newMethod(){  
	        System.out.println("Implementation of default method");  
	    }  
}
