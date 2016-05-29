package com.iciyun.beans;

import org.springframework.stereotype.Component;

/**
 * person
 * @author thinkpad
 *
 */
@Component
public class Person {

	private long Pid;
	
	private String name;
	
	private int age;

	public long getPid() {
		return Pid;
	}
	

	public void setPid(long pid) {
		Pid = pid;
	}
	

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}
	

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [Pid=" + Pid + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
