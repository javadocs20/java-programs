package com.lamda;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		Greeting greetingAction=() -> System.out.println("Hello World!!!");
		greeter.greet(greetingAction);
		Greeting greetingAction2=() -> System.out.println("Hello World Lamda!!!");
		greeter.greet(greetingAction2);
		
		Greeting greetingAction3= new Greeting() {
			
			@Override
			public void perform() {
				
				System.out.println("Hello World Anonmious!!!");
			}
		};
		greetingAction3.perform();
		greeter.greet(greetingAction3);

	}

}
