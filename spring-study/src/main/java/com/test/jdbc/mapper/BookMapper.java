package com.test.jdbc.mapper;

import com.test.jdbc.Books;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {

	public void insertBook(Books books);

	public Books queryById(@Param("id") Integer id);

}
