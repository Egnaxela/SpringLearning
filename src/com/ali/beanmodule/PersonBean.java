/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月7日 下午11:28:34  
 *  
 */  

package com.ali.beanmodule;

import java.util.List;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月7日 下午11:28:34  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月7日      Pluto       1.0         1.0 Version  
 */

public class PersonBean {
	private String firstName;
	private String lastName;
	private int age;
	private float salary;
	private List<Children> childrens;
	
	
	
	/**
	 * 
	 */
	public PersonBean() {
		super();
		System.out.println("non-args Constructor called .....");
	}
	/**
	 * @param name
	 * @param age
	 * @param salary
	 */
	public PersonBean(String lastName, int age, float salary) {
		super();
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		System.out.println("3 args Constructor called .....");
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	/**
	 * @return the childrens
	 */
	public List<Children> getChildrens() {
		return childrens;
	}
	/**
	 * @param childrens the childrens to set
	 */
	public void setChildrens(List<Children> childrens) {
		this.childrens = childrens;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param salary
	 * @param childrens
	 */
	public PersonBean(String firstName, String lastName, int age, float salary, List<Children> childrens) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.childrens = childrens;
	}
	@Override
	public String toString() {
		return "PersonBean [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ ", childrens=" + childrens + "]";
	}

	
	
	
	
}
