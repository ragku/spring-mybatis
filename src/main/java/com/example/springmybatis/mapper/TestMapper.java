package com.example.springmybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.springmybatis.model.TestDO;

public interface TestMapper {

	@Select("SELECT id, value FROM t_test WHERE id=#{id}")
	public TestDO getTest(@Param("id") Long id);
	
	@Insert("INSERT INTO t_test(id,value) VALUES(#{id}, #{value})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int insertTest(TestDO test);

}
