package com.ict.day19;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex02_main {
	public static void main(String[] args) {
		Stream<Ex02> stream = Ex02.visits_list.stream();
		
		double avg = stream.collect(Collectors.averagingInt(i->i.getVisits()));
		System.out.println("전체 방문한 사람 평균 횟수 : " + avg);
		
				
		stream = Ex02.visits_list.stream();
		OptionalDouble avg2 = stream.mapToInt(i->i.getVisits()).average();
		System.out.println("전체 방문한 사람 평균 횟수 : " + avg2.getAsDouble());
		double avg3 = avg2.getAsDouble();
		System.out.println("전체 방문한 사람 평균 횟수 : " + avg3);
		
		// 회원이름만 리스트로 만들어서 출력하자
		stream = Ex02.visits_list.stream();
		List<String> names = stream.map(i->i.getName()).collect(Collectors.toList());
		System.out.println("회원 이름 : " + names);
		stream = Ex02.visits_list.stream();
		Map<Type, Long> cnt = stream.collect(
				Collectors.groupingBy(i->i.getType(), Collectors.counting()));
		System.out.println("타입별 인원 수 :" + cnt);
		
		
	}
}
