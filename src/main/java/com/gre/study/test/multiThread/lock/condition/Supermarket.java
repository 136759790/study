package com.gre.study.test.multiThread.lock.condition;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 超市饮料柜台
 * @author Qxq
 *
 */
public class Supermarket {
	private List<Integer> drinks = new LinkedList<Integer>();
	//默认非公平锁
	private Lock lock = new ReentrantLock();
	//进货条件
	private Condition addCondition = lock.newCondition();
	//销售条件
	private Condition sellCondition = lock.newCondition();
	
	public void addDrink(){
		try {
			lock.lock();
			while (drinks.size() >= 1) {
				try {
					System.out.println(Thread.currentThread().getName()+"有酒代卖，不能进货。");
					addCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			drinks.add(1);
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"柜台进货了，客人可以买着喝了");
			sellCondition.signal();
		} finally{
			lock.unlock();
		}
	}
	public void sellDrink(){
		try {
			lock.lock();
			while (drinks.size() == 0) {
				try {
					System.out.println(Thread.currentThread().getName()+"柜台没货了，等超市进货");
					sellCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			drinks.remove(0);
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"酒卖完了，赶紧进货");
			addCondition.signal();
		} finally{
			lock.unlock();
		}
	}
	
}
