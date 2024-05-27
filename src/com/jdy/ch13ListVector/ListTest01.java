package com.jdy.ch13ListVector;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		
		list1.add("홍길동");
		list1.add("이순신");
		list1.add("장보고");
		list1.add("김유신");
		list1.add("강감찬");
		
		int listSize = list1.size();
		System.out.println(listSize);
		
		String a = list1.get(0);
		System.out.println(a);
		
		int b = list1.indexOf("이순신");
		System.out.println(b);
		
		for (int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("---------------------------");
				
		String c = list1.remove(0);
		
		for (int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		
		
		
		
	}

}
