package com.yh.hibernate.inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author yh
 * @date 2014年9月8日 下午3:37:03
 * 基类一张表，每个子类一张表
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseCategoryJoin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
