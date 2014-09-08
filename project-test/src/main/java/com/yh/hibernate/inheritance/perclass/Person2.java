package com.yh.hibernate.inheritance.perclass;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author yh
 * @date 2014年9月7日 下午11:05:05
 * 每个子类一张表，父类无表
 */
@MappedSuperclass
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Person2 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
//Getters and setters omitted here...
}

