package com.test.jdbc;

import org.apache.ibatis.annotations.Param;

public interface BookMapper {

	public void insertBook(Books books);

	public Books queryById(@Param("id") Integer id);

}
