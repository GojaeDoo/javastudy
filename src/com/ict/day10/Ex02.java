package com.ict.day10;

public class Ex02 {
	public static void main(String[] args) {
		Ex01  t = new Ex01 ();
		int var1 = 100;
		// 인자가 기본자료형 : Call By value 
		// 값이 변하지 않는다.
		int var2 = t.add(var1);
		
		//값이 변하지 않는다.
		System.out.println("값 : " + var1); //100
		System.out.println("값 : " + var2); //101
		
		int su [] = {1, 10, 100, 1000}; // 배열 선언
		// 인자가 객체 (배열도 포함) 자료형 : Call By Reference
		// 참조되는 값이 변할 수 도 있다.
		
		t.add2(su);
		// 배열안의 값이 변한다.
		for (int i = 0; i < su.length; i++) { // 배열 호출
			System.out.println(su[i]);
		}
	}
}
