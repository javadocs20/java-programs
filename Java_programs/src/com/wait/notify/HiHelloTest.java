package com.wait.notify;

public class HiHelloTest {

	public static void main(String[] args) {
		
		HiHello hiHello=new HiHello();
	
		HiThread hiObj=new HiThread(hiHello);
		HelloThread helloObj=new HelloThread(hiHello);
		
		Thread hiThread=new Thread(hiObj, "HiThread");
		Thread helloThread=new Thread(helloObj, "HelloThread");
		hiThread.start();
		helloThread.start();
		/*try {
			hiThread.join();
			helloThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
