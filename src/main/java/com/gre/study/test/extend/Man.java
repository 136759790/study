package com.gre.study.test.extend;

public class Man extends People {

	@Override
	public void say() {
		super.say();
		System.out.println("I'm a Man");
	}
	
	
	public static void main(String[] args) {
		People p =new Man();
		p.say();
	}
}
