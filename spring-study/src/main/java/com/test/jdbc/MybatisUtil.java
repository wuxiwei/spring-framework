package com.test.jdbc;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.Reader;

/**
 * @author wuxw
 * @since 2020/4/15
 */
public class MybatisUtil {

	private final static SqlSessionFactory sqlSessionFactory;

	static {
		String resource = "mybatis-config.xml";
		Reader reader = null;

		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
