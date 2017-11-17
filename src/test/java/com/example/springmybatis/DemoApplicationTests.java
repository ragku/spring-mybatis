package com.example.springmybatis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springmybatis.mapper.TestMapper;
import com.example.springmybatis.model.TestDO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	private TestMapper testMapper;

	@Test
	public void contextLoads() {
		TestDO test = new TestDO();
		test.setValue("test");
	    Integer value = testMapper.insertTest(test);
	    Assert.assertEquals(Integer.valueOf(1), value);
	    
//	    Assert.assertEquals(Long.valueOf(1), test.getId());
	}

	@Test
	public void selectTest() {
		TestDO test = testMapper.getTest(1L);
		Assert.assertNotNull(test);
		
	    Assert.assertEquals("test", test.getValue());
	}
}
