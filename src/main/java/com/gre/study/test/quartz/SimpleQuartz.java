package com.gre.study.test.quartz;

import org.junit.Test;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleQuartz {
	@Test
	public void test1(){
		try {
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			scheduler.start();
			Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger", "group1")
							.startNow()
							.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).repeatForever())
							.build();
			JobDetail job = JobBuilder.newJob(Myjob.class).withIdentity("myJob","group1")
							.build();
			scheduler.scheduleJob(job, trigger);
			Thread.sleep(10000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
