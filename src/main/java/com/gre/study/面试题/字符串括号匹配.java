package com.gre.study.面试题;

import java.util.Stack;

import org.junit.Test;


public class 字符串括号匹配 {
	/**
	 * 
	 */
	@Test
	public void test1(){
		String s ="[{}(){(})]";
//		String s ="[{}(){}]";
		System.out.println(match(s));
	}
	
	private Boolean match(String s){
		Stack<Character> sk = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(' ){
				sk.push('(');
			}else if(s.charAt(i) == ')'){
				if(!sk.isEmpty() && sk.pop() == '(')
					continue;
				else
					return false;
			}else if(s.charAt(i)=='[' ){
				sk.push('[');
			}else if(s.charAt(i) == ']'){
				if(!sk.isEmpty() && sk.pop() == '[')
					continue;
				else
					return false;
			}else if(s.charAt(i)=='{' ){
				sk.push('{');
			}else if(s.charAt(i) == '}'){
				if(!sk.isEmpty() && sk.pop() == '{')
					continue;
				else
					return false;
			}
		}
		return sk.isEmpty();
	}
}
