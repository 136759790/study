package com.gre.study.test.multiThread.lock.condition;

public class Adder extends Thread{
	private Supermarket market;
	@Override
	public void run() {
		while (true) {
			market.addDrink();
		}
	}

	public Adder(Supermarket market) {
		super();
		this.market = market;
	}
}
