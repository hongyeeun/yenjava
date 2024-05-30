package org.yen.day09.oop.encapsulation;

public class Circle {
	//멤버변수
	// 반지름
	// 이름
	private double radius;
	private String name;
	
	// setter() 메소드
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// getter() 메소드
	public double getRadius() {
		return this.radius;
	}
	public String getName() {
		return this.name;
	}
	
	// 넓이 구하기
	public double getArea() {
		//return을 쓰면 public 옆에
		//리턴값과 같은 데이터타입을 써야함 (void 대신)
		return 3.14*this.radius*this.radius;
		//내가 갖고 있는 radius를 쓰겠다... -> this
	}
}
