package com.test.jdbc;

import java.sql.Date;

/**
 * @author wuxw
 * @since 2020/4/14
 */
public class Books {

	Integer id;

	String title;

	String author;

	Date date;

	public Books(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Books(Integer id, String title, String author, Date date) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.date = date;
	}

	public Books() {
		super();
	}

	@Override
	public String toString() {
		return "Books{" +
				"id=" + id +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", date=" + date +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
