package com.gre.study.test.multiThread.lock.condition;

import org.junit.Test;

public class TestCondition {
	@Test
	public void shop() throws Exception{
		Supermarket market = new Supermarket();
		Buyer[] buyers = new Buyer[5];
		Adder adder =new Adder(market);
		for (Buyer b : buyers) {
			b = new Buyer(market);
			b.start();
		}
		adder.start();
		Thread.sleep(10000L);
	}
}
