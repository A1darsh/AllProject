package com.zensar.thread;

public class MyThread implements Runnable {

	Greeting greeting=null;
	String name=null;
	public MyThread(Greeting greeting,String name) {
		this.greeting=greeting;
		this.name=name;
	}
	@Override
	public void run() {
		try {
			greeting.greet(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	/*public void run() {
		
		
		if (Thread.currentThread().getName().equals("t1"))
		{
			for (int i = 0; i < 10; i++) {
				/*try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("adarsh");
			}
		}
		if (Thread.currentThread().getName().equals("t2"))
		{
			for (int i = 0; i < 10; i++) {
				/*try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("seeta");
			}
		}

	}*/
}
