package com.yh.base;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.util.Assert;


/**
 * @author yh
 * @date 2014年9月7日 下午3:41:19
 */
@ContextConfiguration(locations={
		"/appconfig/applicationContext.xml"})
public class BaseSpringTestCase extends AbstractJUnit4SpringContextTests{

	private static  Logger log =LoggerFactory.getLogger(BaseSpringTestCase.class);
	
	@Test
	public void init(){
		Assert.notNull(this.applicationContext);
		if(log.isDebugEnabled()){
			log.info("springContext init finished");
		}
		
	}
	
}

