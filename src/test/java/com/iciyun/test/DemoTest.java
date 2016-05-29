package com.iciyun.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iciyun.beans.Person;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class DemoTest {

	@Autowired
	private Person person;
	
	@Before
	public void init() {
		person.setPid(8);
		person.setName("ciyun");
		person.setAge(1);
	}
	
	@Test
	public void print(){
		System.out.println(person);
	}
	
	@Test
	public void modify(){
		System.out.println("修改前：：：" + person);
		person.setPid(10);
		System.out.println("修改后------" + person);
	}
	@Test
	public void create(){
		Person person = new Person();
		person.setAge(2);
		System.out.println(person);
	}
}
