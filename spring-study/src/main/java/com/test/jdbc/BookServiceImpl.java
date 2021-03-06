package com.test.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

/**
 * @author wuxw
 * @since 2020/4/14
 */
public class BookServiceImpl implements BookService {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(Books books) throws Exception {
		// 如果是原生的处理方式
//		try {
//			assert jdbcTemplate.getDataSource() != null;
//			PreparedStatement update = jdbcTemplate.getDataSource().getConnection().prepareStatement("insert into books(title, author, date) values (?, ?, ?)");
//			update.setString(1, books.getTitle());
//			update.setString(2, books.getAuthor());
//			update.setDate(3, books.getDate());
//			update.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		// spring处理方式,会把参数自动设置
		jdbcTemplate.update("insert into books(title, author, date) values (?, ?, ?)",
				new Object[] {books.getTitle(), books.getAuthor(), new Date(1)},
				new int[] {Types.VARCHAR, Types.VARCHAR, Types.DATE});

		throw new Exception("save");
	}

	@Override
	public List<Books> getBooks() {
		return jdbcTemplate.query("select * from books", new BookRowMapper());
	}
}
