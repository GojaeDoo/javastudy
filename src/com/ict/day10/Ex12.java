package com.ict.day10;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 t = new Ex11();
		
		System.out.println(t.getName());
		// 홍길동 이름을 둘리로 변경하자 
		t.setName("둘리");
		// 변경 후 이름 가져오기 
		System.out.println("이름 : " + t.getName());
		
		// 나이를 변경하자 
		t.setAge(15000);
		// 변경 후 나이 가져오기
		System.out.println("나이 : " + t.getAge());
		
		
	}
}
