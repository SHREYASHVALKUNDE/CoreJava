package com.edubridge.multithreadingdemo;

public class RunnableInterfaceDemo implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread " +i+" is in the running state");
			
		
		}
		
	}
	public static void main(String[] args) {
		RunnableInterfaceDemo r=new RunnableInterfaceDemo();
		Thread t=new Thread(r);
		
		try {
			t.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t.start();
		
		
		
		
		
		
		
	

	}



}
