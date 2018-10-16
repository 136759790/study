package com.gre.study.test.multiThread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.Test;

/**
 * 测试可重入锁
 * @author Qxq
 *
 */
public class TestReenTrantLock {
	@Test
	public void test1(){
		Lock lock = new ReentrantLock();
		Lock lock_fair = new ReentrantLock(true);
		Condition sell = lock.newCondition();
		Condition buy = lock.newCondition();
	}
}
