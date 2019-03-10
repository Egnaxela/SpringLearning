/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月8日 下午5:20:30  
 *  
 */  

package com.ali.beanmodule;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月8日 下午5:20:30  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月8日      Pluto       1.0         1.0 Version  
 */

public class Children {
	private String firstName;
	private String gender;
	private int age;
	/**
	 * 
	 */
	public Children() {
		System.out.println("Children Constructor*******************");
	}
	/**
	 * @param firstName
	 * @param gender
	 * @param age
	 */
	public Children(String firstName, String gender, int age) {
		super();
		this.firstName = firstName;
		this.gender = gender;
		this.age = age;
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
		System.out.println("Set FirstName*************");
		this.firstName = firstName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	@Override
	public String toString() {
		return "Children [firstName=" + firstName + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	public void initParams() {
		System.out.println("Children  init method *****************");
	}
	
	public void destroyPro() {
		System.out.println("Children  destroy method*************");
	}
}
