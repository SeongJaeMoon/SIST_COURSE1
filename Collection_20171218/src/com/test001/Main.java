package com.test001;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// Map 인터페이스
		// - 키와 값의 쌍으로 자료 저장.
		// - 인덱스 제공되지 않는다.
		// - 키(Set)는 중복 저장 가능.
		// - 값(List)은 중복 저장 가능.
		// - 키를 이용해서 값 접근.
		// - 대표적인 구현 클래스는 HashMap 클래스이다.

		// HashTable클래스
		// HashMap 클래스와 동일한 내부 구조를 가지고 있다
		// HashTable 클래스는 멀티 쓰레드 환경에서 Thread Safe 기능을 제공한다.
		Map<String, String> map = new Hashtable<String, String>();

		map.put("A001", "TEST");
		map.put("A002", "SAMPLE");
		map.put("A003", "JAVA");
		map.put("A004", "ORACLE");

		// get() 메소드를 이용해서 특정 자료를 꺼낼 수 있다.
		// 특정 자료를 꺼내는 경우 키 사용

		System.out.println(map.get("A001"));

		// 주의) 자료 전체를 꺼내는 경우 향상된 for문 사용 불가

		// 자료 전체를 꺼내는 경우 Iterator(반복자) 사용
		// -> 키들의 집합(set)을 가지고 반복문 진행하고, 각각의 키별로 값 접근.
		// 주의) 키들의 집합체는 Set 컬렉션이므로 순서대로 나오지 않는다.

		// 특정 키를 이용한 자료 삭제 액션
		map.remove("A001");

		Set<String> KeySet = map.keySet();

		Iterator<String> iterator = KeySet.iterator();

		while (iterator.hasNext()) {

			String key = iterator.next();

			System.out.printf("%s, %s%n", key, map.get(key));

		}

		// 문제) 키들을 정렬시켜서 출력하도록 코드 작성.
		/*
		 * 실행예) A001 TEST A002 SAMPLE ...
		 * 
		 */

		System.out.println(map.containsKey("A001"));
		System.out.println(map.containsValue("JAVA"));

		// 자료 존재 여부 확인
		System.out.println(map.isEmpty());

		// 자료 개수 확인
		System.out.println(map.size());

		// Map 컬렉션에서 자료들의 집합체를 반환 받을 수 있다.
		Collection<String> collections = map.values();

		for (String c : collections) {
			System.out.println(c);
		}

		// 전체 자료 삭제
		map.clear();
		System.out.println(map.isEmpty());

	};
}