package com.gre.study.test.multiThread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.junit.Test;

public class TestThreadPool {
	@Test
	public void testFixedThreadPool(){
		ExecutorService es = Executors.newFixedThreadPool(10);
		ExecutorService es1 = Executors.newCachedThreadPool();
		ExecutorService es2 = Executors.newSingleThreadExecutor();
		ScheduledExecutorService es3 = Executors.newScheduledThreadPool(10);
//		es3.scheduleAtFixedRate(command, initialDelay, period, unit)
	}
}
