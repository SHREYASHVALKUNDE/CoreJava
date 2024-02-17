package com.edubridge.multithreadingdemo;
//1. Creating a thread by extending a Thread class
public class ThreadDemo extends Thread{
	
	public void run()
	{
		/*currentThread() method will gives a current
		executing Thread name*/
		System.out.println("Thread is in the running state:"
				+ " "+Thread.currentThread());
	}

	public static void main(String[] args) {
		
		for(int i=1;i<4;i++)
		{
			ThreadDemo t1=new ThreadDemo();
			ThreadDemo t2=new ThreadDemo();
			t1.setName("Shiwani");
			t1.setPriority(7);
			try {
				t1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*when we call start() method, automatically
			it calls to the run() method*/
			t1.start();
			t2.start();
			
		}
		
		

	}

}
