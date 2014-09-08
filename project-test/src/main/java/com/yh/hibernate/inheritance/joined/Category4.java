package com.yh.hibernate.inheritance.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author yh
 * @date 2014年9月8日 下午3:38:24
 */
@Entity
@PrimaryKeyJoinColumn(name = "c1_id")
public class Category4 extends BaseCategoryJoin {
private String value4;

public String getValue4() {
return value4;
}

public void setValue4(String value) {
this.value4 = value;
}
}

