package com.jdy.ch13ListVector;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> memberList = new ArrayList<>();
		
		Member member1 = new Member();
		member1.setId("no1");
		member1.setPw("11111");
		member1.setName("박정희");
		member1.setAge(65);
		member1.setPhone("010-2333-3444");
		
		Member member2 = new Member();
		member2.setId("no2");
		member2.setPw("22222");
		member2.setName("이승만");
		member2.setAge(81);
		member2.setPhone("010-1111-1234");
		
		Member member3 = new Member("no3", "34567", "전두환", 0, "56");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		System.out.println(memberList.size());
	
		if (memberList.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
		
		
	}

}
