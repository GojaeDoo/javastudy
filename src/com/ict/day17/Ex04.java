package com.ict.day17;


// 두개의 스레드를 생성하여 첫번재 스레드의 출력을 1부터 100까지 출력하고,
// 두번째 스레드가 출력을 101 부터 200까지 출력하라 (synchronized사용)
public class Ex04 implements Runnable{

	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + ++x );
			
		}
	}
}
