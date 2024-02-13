package com.ict.day12;

public class Study {
	public static void main(String[] args) {
		// 문제 5
		// 근무시간이 8시간 까지는 시간당 9860이고
		// 8시간 초과한 시간 만큼은 2배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		
		int myWork = 10;
		int work = 8;
		int price = 9860;
		int workPrice = 0;
		
		if (myWork > work) {
			workPrice = ((myWork - work)* price * 2 ) + work * price; 
		} else {
			workPrice = myWork * price; 
		}
		
		System.out.println(workPrice);
	}
}
