package com.gre.study.面试题;

import org.junit.Test;

/**
 * 求解树的最大深度
 * 		3
 * 	9		20
 * 		15		7
 * 返回3
 * @author zxt
 *
 */
public class 树的最大深度 {
	class Node{
		public int val;
		public Node left;
		public Node right;
	}
	public int getDeep(Node node){
		if(node == null)
			return 0;
		int leftDeep = getDeep(node.left);
		int rightDeep = getDeep(node.right);
		return Math.max(leftDeep, rightDeep)+1;
	}
	
	@Test
	public void test1(){
		Node root = new Node();
		root.val=3;
		Node l1 = new Node();
		l1.val=9;
		root.left=l1;
		Node r1 = new Node();
		r1.val=20;
		root.right=r1;
		Node l2 = new Node();
		l2.val=15;
		r1.left=l2;
		Node r2 = new Node();
		r2.val=7;
		r1.right=l2;
		System.out.println(getDeep(root));
		
	}
	
}
