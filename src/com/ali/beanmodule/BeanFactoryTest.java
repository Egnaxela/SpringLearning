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
	public void testSimpleLoad() {
		BeanFactory context=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		//ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonBean bean=(PersonBean)context.getBean("myTestBean");
		
		PersonBean bean2=(PersonBean)context.getBean("myTestBean2");
		System.out.println(bean);
		System.out.println(bean2);
	}
}
