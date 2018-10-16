package com.gre.study.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

/**
 * 集合框架
 * @author zxt
 * 
 */
public class Test1 {
	
	
	
	/**
	 * 集合框架集成关系
	 * 								Collection
	 * 			List					SET					Queue
	 * 	ArrayList	LinkedList		  HashSet				
	 */
	@Test
	public void test0(){
		Collection c1 = new ArrayList();
		Collection c2 = new LinkedList();
		Collection c3 = new HashSet();
		Collection c4 = new LinkedHashSet();
		Collection c5 = new TreeSet();
		
		
	}
	
	
	
	
	
	
}
