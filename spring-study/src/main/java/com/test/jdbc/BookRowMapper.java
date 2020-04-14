package com.test.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author wuxw
 * @since 2020/4/14
 */
public class BookRowMapper implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Books(rs.getInt("id"), rs.getString("title"),
				rs.getString("author"), rs.getDate("date"));
	}
}
