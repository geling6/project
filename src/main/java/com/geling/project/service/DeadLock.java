package com.geling.project.service;

import java.util.concurrent.TimeUnit;

public class DeadLock implements Runnable{
	
	private static ObjectA a = new ObjectA();
	private static ObjectB b = new ObjectB();
	
	public boolean flag = false;
	
	public void run() {
		if(flag) {
			synchronized(a){
				a.say();
				try {
					TimeUnit.MILLISECONDS.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(b){
					a.get();
				}
			}
		}else {
			synchronized(b) {
				b.say();
				try {
					TimeUnit.MILLISECONDS.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(a) {
					b.get();
				}
			}
		}
	}
}


class ObjectA{
	public void say() {
		System.out.println("give me A, I give you B!");
	}
	public void get() {
		System.out.println("I get A.");
	}
}


class ObjectB{
	public void say() {
		System.out.println("give me B, I give you A !");
	}
	public void get() {
		System.out.println("I get B.");
	}
}