package com.wait.notify;

public class HiHello {

	boolean flag=false;
	
	public synchronized void printHi() {
		if(flag) {
			try {
				System.out.println(Thread.currentThread().getName() +"  is waiting");
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() +"::::=Hi printing....");
		flag=true;
		notify();
	}
	
	public synchronized void printHello() {
		if(!flag) {
			try {
				System.out.println(Thread.currentThread().getName() +"  is waiting");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() +"::::=Hello printing....");
		flag=false;
		notify();
	}
}
