package com.test.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * @author wuxw
 * @since 2020/4/14
 */
public class BooksServiceImpl implements BookService {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(Books books) {
		jdbcTemplate.update("insert into books(id, title, author, date) values (?, ?, ?)",
				new Object[] {books.getId(), books.getTitle(), books.getAuthor(), books.getDate()},
				new int[] {Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.DATE});
	}

	@Override
	public List<Books> getBooks() {
		return jdbcTemplate.query("select * from books", new BookRowMapper());
	}
}
