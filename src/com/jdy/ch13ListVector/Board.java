package com.jdy.ch13ListVector;

public class Board {
	
	private String subject;
	private String contents;
	private String writer;
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(String subject, String contents, String writer) {
		super();
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
