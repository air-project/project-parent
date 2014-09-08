package com.yh.hibernate.inheritance.perclass;

import javax.persistence.Entity;

/**
 * @author yh
 * @date 2014年9月7日 下午11:09:38
 */
@Entity(name="per_student")
public class Student extends Person2{
    private int score;
//Getters and setters omitted here...

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
    
}

