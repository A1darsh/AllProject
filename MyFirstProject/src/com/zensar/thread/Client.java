package com.zensar.thread;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		
		
		Thread t3=new Thread();
		t3.setPriority(Thread.MAX_PRIORITY);
		t3.start();
		/*Thread.currentThread().setPriority(10);
		
		MyThread thread=new MyThread();
		Thread t=new Thread(thread);
		//t.setPriority(10);
		t.setName("t1");
		t.start();
		System.out.println(t.getPriority());
		
		MyThread thread2=new MyThread();
		Thread t2=new Thread(thread2);
		//t2.setPriority(10);
		t2.setName("t2");
		t2.start();
		System.out.println(t2.getPriority());
		
		
		//System.out.println(Thread.currentThread().getPriority());
		//MyThread myThread=new MyThread();
		
		
		//Thread t1=new Thread(myThread ,"t1");
		//t1.setDaemon(true);
		
		//t1.setName("t1");
		//t1.start();
		//System.out.println(t1.getName());
		//Thread t2=new Thread(myThread,"t2");
		//t2.setName("t2");
		//t2.start();
		//System.out.println(t2.getName());
		
		//System.out.println(Thread.currentThread());
		//MyThread t1=new MyThread();
		//t1.setName("t1");
		//System.out.println(t1.getName());
		//t1.start();   //internally call run method
		//Thread.currentThread().sleep(10);
		
		//MyThread t2=new MyThread();
		//t2.setName("t2");
		//System.out.println(t2.getName());
		//t2.start();
		//System.out.println(t2.getName());
		System.out.println("exit");*/
	}

}
