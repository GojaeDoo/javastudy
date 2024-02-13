package com.ict.day12;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		//Random 클래스
		Random ran = new Random();
		int su = ran.nextInt(10) + 1;// 1~10까지
		System.out.println(su);
	}
}
