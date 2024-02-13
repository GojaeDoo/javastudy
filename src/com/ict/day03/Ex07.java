package com.ict.day03;

public class Ex07 {
	public static void main(String[] args) {
		// 2시간 40분 30초를 초로 환산하여라 (몇 초일까요?)
		int h_time = 2 * 60 * 60 ;
		int m_time = 40 * 60;
		int s_time = 30;
		
		int result = h_time + m_time + s_time;
		
		System.out.println("2시간 40분 30초를 초로 환산하면 " + result +"초 입니다.");
		
	}
}
