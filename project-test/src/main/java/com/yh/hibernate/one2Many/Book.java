package com.yh.hibernate.one2Many;
/**
 * @author yh
 * @date 2014年9月7日 下午8:38:54
 */
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="book")
public class Book {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO) 
 private int id;
 @Column(columnDefinition="varchar(20) default '默认直'  COMMENT '注释'")
 private String title;
 @ManyToOne(cascade = CascadeType.ALL, optional = false)
 @JoinColumn(name="rea_id", referencedColumnName="id")//外键为sut_id，与student中的id关联
 private Reader reader;
 @Column(updatable=false, precision=12, scale=2)
 private BigDecimal cost;
 @Transient
 private Date date;
 public int getId() {
  return id;
 }
 public Reader getReader() {
  return reader;
 }
 public void setReader(Reader reader) {
  this.reader = reader;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getTitle() {
  return title;
 }
 public void setTitle(String title) {
  this.title = title;
 }
}
