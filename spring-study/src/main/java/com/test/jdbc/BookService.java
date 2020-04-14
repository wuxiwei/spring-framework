package com.test.jdbc;

import java.util.List;

/**
 * @author wuxw
 * @since 2020/4/14
 */
public interface BookService {

	public void save(Books books);

	public List<Books> getBooks();


}
