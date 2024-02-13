package com.ict.day11;

public class Ex04 {
	public static void main(String[] args) {
		// 객체를 생성할 때 큰뿔소, 3살, 살아있음 지정하자
		
		Ex03 ex03 = new Ex03();
		
		System.out.println(ex03.getAge());
		System.out.println(ex03.getName());
		if(ex03.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");
		}
		System.out.println();
		
	}
}
