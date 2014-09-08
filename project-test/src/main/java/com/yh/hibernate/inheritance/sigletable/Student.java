package com.yh.hibernate.inheritance.sigletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author yh
 * @date 2014年9月7日 下午11:09:38
 */
@Entity
@DiscriminatorValue("student")
public class Student extends Person3{
    private int score;
//Getters and setters omitted here...

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
    
}

