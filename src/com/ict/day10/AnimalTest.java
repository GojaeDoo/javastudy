package com.ict.day10;

public class AnimalTest {
	public static void main(String[] args) {
		// 객체 생성
		Animal t = new Animal();
		
		// 변경 전 출력
		System.out.println(t.getAge());
		System.out.println(t.getName());
		if(t.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");
		}
		
		System.out.println();
		// 변경
		t.setName("펭귄");
		
		// 변경 후 출력
		System.out.println(t.getAge());
		System.out.println(t.getName());
		if(t.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");
		}
		System.out.println();
		
		
		
		
		Animal t2 = new Animal();
		System.out.println(t2.getAge());
		System.out.println(t2.getName());
		if(t2.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");
		}
		System.out.println();
		
	}
}
