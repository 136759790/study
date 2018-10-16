package com.gre.study.test.multiThread.lock.condition;

public class Buyer extends Thread{
	private Supermarket market;

	@Override
	public void run() {
		while (true) {
			market.sellDrink();
		}
	}

	public Buyer(Supermarket market) {
		super();
		this.market = market;
	}
	
	
	
	
}
