package com.test.jdbc;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wuxw
 * @since 2020/4/14
 */
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
// Transactional 默认情况下 Spring 中的事务处理只对 RuntimeException 方法进行回滚，
// 所以，如果 此处将 Runtime Exception 替换成普通的 Exception 不会产生回滚效果，需要配置rollbackFor = Exception.class
public interface BookService {

	public void save(Books books) throws Exception;

	public List<Books> getBooks();


}
