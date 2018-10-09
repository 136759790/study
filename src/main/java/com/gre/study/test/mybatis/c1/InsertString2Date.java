package com.gre.study.test.mybatis.c1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gre.study.App;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
public class InsertString2Date {
	@Autowired
	S2dMapper s2dMapper;
	/**
	 * 测试string插入到date类型中
	 */
	
	@Test
	public void test1(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(d);
		s2dMapper.insertString2Date(now, d);
		System.out.println(123);
	}
	
	@Mapper
	interface S2dMapper{
		@Insert("insert into String2Date values(#{starttime,jdbcType=TIMESTAMP},#{endtime})")
		void insertString2Date(@Param("starttime")String starttime,@Param("endtime")Date endtime);
	}
}
