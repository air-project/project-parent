package com.yh.hibernate.inheritance.sigletable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author yh
 * @date 2014年9月7日 下午11:05:05
 * 父类加所有子类一张表
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="flag_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("person")
public class Person3 {
    @Id
    @GeneratedValue
    private int id;
    private String name;
//Getters and setters omitted here...
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}

