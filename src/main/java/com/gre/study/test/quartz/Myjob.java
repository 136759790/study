package com.gre.study.test.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Myjob implements Job{
		
		@Override
		public void execute(JobExecutionContext arg0)
				throws JobExecutionException {
			System.out.println("123");
			
		}
		
}
