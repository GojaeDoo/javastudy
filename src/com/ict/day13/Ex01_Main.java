package com.ict.day13;

public class Ex01_Main {
	public static void main(String[] args) {
		// 일반클래스에서 static 호출
		System.out.println(Ex01.su2);
		System.out.println(Ex01.SU4);
		System.out.println();
		
		// 인터페이스는 다 상수다.
		// 스택틱 파이널을 다 생략하는 대신 모든걸 스택틱 파이널로 인식한다.
		System.out.println(Ex02.su1);
		System.out.println(Ex02.su2);
		System.out.println(Ex02.su3);
		System.out.println(Ex02.su4);
	}
}
