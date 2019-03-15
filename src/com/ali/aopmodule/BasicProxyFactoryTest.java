/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019��3��14�� ����5:51:20  
 *  
 */  

package com.ali.aopmodule;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019��3��14�� ����5:51:20  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019��3��14��      Pluto       1.0         1.0 Version  
 */

public class BasicProxyFactoryTest {
	public static void main(String[] args) {
		//�������
		IUserDao proxy=new UserDaoStaticProxy();
		//ִ�д�����
		proxy.save();
		
		
		IUserDao target=new UserDao();
		System.out.println("Ŀ�����:"+target.getClass());
		
		//��̬�������
		IUserDao proxy2=(IUserDao)new UserDaoDynamicProxy(target).getProxyInstance();
		System.out.println("�������:"+proxy2.getClass());
		proxy2.save();
		
	}
}


/**
 * ��̬����
 * 1����̬�������Դ�����ڳ��������ڼ䣬ͨ��JVM����Ȼ��ƶ�̬���ɵġ�
 * 2���������ί����Ĺ�ϵ������ʱ��ȷ���ġ�
 * 
 * ʹ��JDK���ɶ�̬�����ǰ����Ŀ�������Ҫʵ�ֽӿڵķ���
 * ��ʱ����ʹ��CGLIB�����Զ�̬���ɵ�����̳�Ŀ��ķ�ʽʵ�֣��������ڼ䶯̬�����ڴ��й���һ������
 * �磺class CglibProxy extends UserDao{ } 
 * ʹ��cglib�����ǰ����Ŀ���಻��Ϊfinal���Σ���Ϊfinal���ε��಻�ܱ��̳���
 */
class UserDaoDynamicProxy{
	private Object target;
	
	public UserDaoDynamicProxy(Object target) {
		this.target=target;
	}
	
	//���ض�Ŀ�����target�����Ķ���
	public Object getProxyInstance() {
		Object proxy=Proxy.newProxyInstance(
		target.getClass().getClassLoader(),
		target.getClass().getInterfaces(),
		new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//��ȡ��ǰִ�з����ķ�����
				String methodName=method.getName();
				
				//�����ķ���ֵ
				Object result=null;
				if("find".equals(methodName)) {
					result=method.invoke(target, args);
				}else {
					System.out.println("��������......");
					result=method.invoke(target, args);
					System.out.println("�ύ����......");
					
				}
				return result;
			}
		});
		
		return proxy;
	}
} 




/**
 * 
 * ��̬����
 * 1��Ŀ��������Ҫʵ�ֽӿ�
 * 2������������Ҫʵ����Ŀ�����һ���Ľӿ�
 * 
 * ȱ��:һ���ӿ������ӷ�������Ӧ�� �������ʵ��Ŀ���඼Ҫʵ�ֶ�Ӧ�ķ����������˴����ά���ɱ�
 * 
 */
class UserDaoStaticProxy implements IUserDao{

	//�����������ά��һ��Ŀ�����
	private IUserDao target=new UserDao();
	
	@Override
	public void save() {
		System.out.println("�������:��������...........");
		target.save();
		System.out.println("�������:�ύ����...........");
	}

	@Override
	public void find() {
		System.out.println("�������:��������...........");
		target.find();
		System.out.println("�������:�ύ����...........");
	}
	
}



//Ŀ�����
class UserDao implements IUserDao{

	@Override
	public void save() {
		System.out.println("�����û�............");
	}

	@Override
	public void find() {
		System.out.println("��ѯ�û�.............");
	}
	
}


//�ӿ�
interface IUserDao{
	void save();
	void find();
}