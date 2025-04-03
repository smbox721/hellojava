package com.javaex.problem01;

public class Member {
	private String name; // 회원 이름
	private String id; // 회원 아이디
	private int point; // 회원 포인또
	
	//생성자 
	public Member(String name, String id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}

	
}
