package com.test.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		// 如果是原生的处理方式
//		try {
//			assert jdbcTemplate.getDataSource() != null;
//			PreparedStatement update = jdbcTemplate.getDataSource().getConnection().prepareStatement("insert into books(id, title, author, date) values (?, ?, ?, ?)");
//			update.setInt(1, books.getId());
//			update.setString(2, books.getTitle());
//			update.setString(3, books.getAuthor());
//			update.setDate(4, books.getDate());
//			update.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		// spring处理方式,会把参数自动设置
		jdbcTemplate.update("insert into books(id, title, author, date) values (?, ?, ?, ?)",
				new Object[] {books.getId(), books.getTitle(), books.getAuthor(), books.getDate()},
				new int[] {Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.DATE});
	}

	@Override
	public List<Books> getBooks() {
		return jdbcTemplate.query("select * from books", new BookRowMapper());
	}
}
