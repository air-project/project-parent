package com.yh.hibernate.one2one;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yh.base.BaseSpringTestCase;
import com.yh.hibernate.inheritance.sigletable.Student;
import com.yh.hibernate.inheritance.sigletable.Teacher;
import com.yh.hibernate.one2Many.Book;
import com.yh.hibernate.one2Many.Reader;

/**
 * @author yh
 * @date 2014年9月7日 下午3:39:45
 */
public class HibernateTest extends BaseSpringTestCase {
	@Autowired
	private SessionFactory sessionFactory;
	@Test
	public void add() {
		Student s=new Student();
		s.setScore(20);
		Teacher t = new Teacher();
		t.setTitle("aaa");
		sessionFactory.openSession().save(t);
	}
	@Ignore
	@Test
	public void search() {
		List<Reader> list=sessionFactory.openSession().createSQLQuery("select {r.*},{b.*} from reader r join book b on r.id=b.rea_id").addEntity("r",Reader.class)
				.addEntity("b",Book.class).list();
//		for(Reader r:list){
//			//Hibernate.initialize(r.getBooks());
//			List<Book> books =r.getBooks();
//			for(Book b:books){
//				System.out.println(b.getTitle());
//			}
//		}
	}
	@Ignore
	@Test
	public void search2() {
		List<Reader> list=sessionFactory.openSession().createSQLQuery("select name from reader").setResultTransformer(Transformers.aliasToBean(Reader.class)).list();
		for(Reader r:list){
			System.out.println(r.getName());
		}
	}
}
