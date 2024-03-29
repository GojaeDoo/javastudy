package com.ict.day05;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 for문 : for문 안에 또 다른 for문이 존재 하는 것
		
		for (int i = 0; i < 4; i++) {
			System.out.println("명령문1");
			for (int j = 0; j < 6; j++) {
				System.out.println( "I=" + i + ",j= " + j );
				
			}
			System.out.println("명령문2");
		}
		
		
		// 구구단 방식1
		for (int i = 2; i < 10; i++) {
			System.out.println();
			System.out.println(i+"단");
			System.out.println();
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		// 구구단 방식2
		for (int i = 2; i < 10; i++) {
			System.out.println();
			System.out.println();
			System.out.println(i+"단");
			System.out.println();
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "  ");
			}
		}
		
		// 구구단 방식3
		for (int i = 1; i < 10; i++) {
			System.out.println();
			System.out.println();
			System.out.println(i+"단");
			System.out.println();
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "  ");
			}
		}
		
		// 0 0 0 0
	    // 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		System.out.println("후우");
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 4; j++) {
				System.out.print("0 ");
			} System.out.println();
		}
		
		
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 ; j++) {
				if (i == j) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
		}System.out.println();
	}
}
