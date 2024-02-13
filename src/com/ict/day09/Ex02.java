package com.ict.day09;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 클래스에 static 변수와 상수가 있다.
		// 객체 생성 없이 호출 할 수 있다.
		int k1 = Ex01.eng;
		int k2 = Ex01.COMPUTER;
		System.out.println("eng : "+ k1);
		System.out.println("com : "+ k2);
		
	
		
		// Ex01 클래스를 객체로 만들자.
		// 해당 클래스에 생성자가 없으면 무조건 기본 생성자 만든다.
		// 클래스이름 () => 인자가 없는 생성자를 기본생성자라고 한다.
		// Ex01 t = new 생성자 ([인자]);
		
		// 메모리
		// - 스태틱 (static) : 프로그램이 시작 전부터 끝까지 존재하는 메모리 영역
		// - heap : 프로그램이 시작할때는 있거나 중간에 만들어졌다가
		//          어느 순간에는 없어진다. (동적할당)
		//          자기 할일을 다하면 사라진다.
		//
		// - 스택 : heap 영역에 생성된 object 타입의 데이터의 참조값이 할당된다.
		//         원시타입의 데이터가 값과 함께 할당된다.
		//         원시타입(byte. short,int, log,double,float,boolean,char)타입의
		//         데이터들이 할당된다. 이때 원시타입의 데이터들에 대해서는 참조값을 저장하는 것이
		//         아니라 실제 값을 stack에 직접 저장 하게 된다.
		
		
		System.out.println();
		Ex01 t = new Ex01();
		System.out.println(t);
		System.out.println(t.name);
		System.out.println(t.kor);
		System.out.println(t.MATH);
		
		System.out.println();
		System.out.println("eng : " + k1);
		System.out.println("com : " + k2);
		System.out.println();
		
		System.out.println(t.eng);
		System.out.println(t.COMPUTER);
		
		// 변수와 상수 
		// 변수이므로 데이터 변경가능
		t.kor = 90;
		System.out.println(t.kor);
		
		
		// 상수이기 때문에 변경불가.
		// t.MATH = 100;
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
