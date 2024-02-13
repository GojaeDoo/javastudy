package com.ict.day11;

public class Study2 {
	public static void main(String[] args) {
		Study study = new Study();
		System.out.println("이름 : " + study.getName());
		System.out.println("나이 : " + study.getAge());
		System.out.println("주소 : " + study.getAddr());
		System.out.println();
		
		// 값 변경
		study.setName("고길동"); 
		study.setAge(50); 
		study.setAddr("성정동");
		
		System.out.println("이름 : " + study.getName());
		System.out.println("나이 : " + study.getAge());
		System.out.println("주소 : " + study.getAddr());
		System.out.println();
	}
}
