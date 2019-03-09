/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月4日 下午9:55:25  
 *  
 */  

package com.ali.beanmodule;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月4日 下午9:55:25  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月4日      Pluto       1.0         1.0 Version  
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	
	@Test
	public void testSimpleLoad() throws SQLException {
		BeanFactory context=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonBean bean=(PersonBean)context.getBean("myTestBean");
		PersonBean bean2=(PersonBean)context.getBean("myTestBean2");
		System.out.println(bean);
		System.out.println(bean2);
		System.out.println("-----------------------");
		//bean在IOC容器中默认只会创建一次,是单例模式
		Children children=(Children)ctx.getBean("children3");
		Children children2=(Children)ctx.getBean("children3");
		System.out.println(children==children2);
		System.out.println("-----------------------");
		
		DataSource dataSource=(DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
		
	}
}
