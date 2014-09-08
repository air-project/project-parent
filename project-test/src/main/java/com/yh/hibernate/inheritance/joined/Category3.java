package com.yh.hibernate.inheritance.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author yh
 * @date 2014年9月8日 下午3:37:42
 */
@Entity
@PrimaryKeyJoinColumn(name = "c_id")
public class Category3 extends BaseCategoryJoin {
private String value3;

public String getValue3() {
return value3;
}

public void setValue3(String value) {
this.value3 = value;
}
}

