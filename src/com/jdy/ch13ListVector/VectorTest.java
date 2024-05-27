package com.jdy.ch13ListVector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Board> vector1 = new Vector<>();
		
		Board board1 = new Board();
		board1.setSubject("주제1");
		board1.setContents("내용1");
		board1.setWriter("작가1");
		
		Board board2 = new Board();
		board2.setSubject("주제2");
		board2.setContents("내용2");
		board2.setWriter("작가2");
		
		Board board3 = new Board("주제3", "내용3", "작가3");
		
		vector1.add(board1);
		vector1.add(board2);
		vector1.add(board3);
		vector1.add(new Board("주제4", "내용4", "작가4"));
		
		System.out.println(vector1.size());
	}

}
