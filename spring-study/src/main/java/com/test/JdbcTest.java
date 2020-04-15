package com.test;

import com.test.jdbc.mapper.BookMapper;
import com.test.jdbc.Books;
import com.test.jdbc.MybatisUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxiwei
 * @date 2020/3/15
 */
public class JdbcTest {

	private final static SqlSessionFactory sqlSessionFactory;
	static {
		sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
	}

	public static void main(String[] args) {

//		jdbc
//		ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
//		BookService bookService = (BookService) bf.getBean("bookService");
//		bookService.save(new Books("1", "1"));
//		List<Books> books = bookService.getBooks();
//		System.out.println(books);

//		mybatis
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
//		Books myBooks = new Books("2","2");
//		bookMapper.insertBook(myBooks);
//		Books books = bookMapper.queryById(1);
//		System.out.println(books);
//		sqlSession.commit();



//		spring-mybatis
		ApplicationContext bf = new ClassPathXmlApplicationContext("mybatis-spring-config.xml");
		BookMapper bookMapper = (BookMapper) bf.getBean("bookMapper");
//		Books myBooks = new Books("3","3");
//		bookMapper.insertBook(myBooks);
		Books books = bookMapper.queryById(1);
		System.out.println(books);
	}


}
