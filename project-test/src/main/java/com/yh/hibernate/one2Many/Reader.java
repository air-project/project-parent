package com.yh.hibernate.one2Many;

/**
 * @author yh
 * @date 2014年9月7日 下午8:37:48
 */
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reader")
public class Reader {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String meno;
	private String name;
	@OneToMany(mappedBy = "reader", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Book> books = new ArrayList<Book>();

	public Reader() {
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
