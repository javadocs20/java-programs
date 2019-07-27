package com.executor;

import java.util.concurrent.ExecutorService;

import com.util.ExecutorFactory;

/*
 * On one CounterRunnable object 
 */
public class TestExecutorFramework {

	public static void main(String[] args) {
		CounterRunnable counter1 = new CounterRunnable("Obj1");
		CounterRunnable counter2 = new CounterRunnable("Obj2");
		CounterRunnable counter3 = new CounterRunnable("Obj3");
		CounterRunnable counter4 = new CounterRunnable("Obj4");
		
		ExecutorService execService = ExecutorFactory.getExecutorService();
		
		System.out.println("First execution:");
		execService.execute(counter1);
		
		System.out.println("Second execution:");
		//execService.execute(counter1);
		execService.execute(counter2);
		
		System.out.println("Third execution:");
		//execService.execute(counter1);
		execService.execute(counter3);
		
		System.out.println("Forth execution:");
		//execService.execute(counter1);
		execService.execute(counter4);
				
		
		execService.shutdown();
		String main = Thread.currentThread().getName();
		System.out.println("Which thread main() runs within?"+" "+main);
	}
}