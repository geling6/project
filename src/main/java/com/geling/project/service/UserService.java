package com.geling.project.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public void  getUser(){
		
		while(true) {
			double x=1.0 / 10 * 3.1415926 / 8.97;
		}
	}
	
	public void test() {
		DeadLock t1 = new DeadLock();
		DeadLock t2 = new DeadLock();
		t1.flag = true;
		t2.flag = false;
		
		new Thread(t1).start();
		new Thread(t2).start();
	}
}
