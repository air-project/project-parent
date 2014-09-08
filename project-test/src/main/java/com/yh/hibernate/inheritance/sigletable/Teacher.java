package com.yh.hibernate.inheritance.sigletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author yh
 * @date 2014年9月7日 下午11:10:19
 */
@Entity
@DiscriminatorValue("teacher")
public class Teacher extends Person3{
    private String title;
//Getters and setters omitted here...

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    
}
