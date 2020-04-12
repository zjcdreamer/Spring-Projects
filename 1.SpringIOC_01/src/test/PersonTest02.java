package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Person;

public class PersonTest02 {
	
	@Test
	public void test01() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application2.xml");
		System.out.println("===========测试null==============");
		Person person = (Person)applicationContext.getBean("person01");
		System.out.println(person);
		
		System.out.println("===========内部bean==============");
		Person person2 = (Person)applicationContext.getBean("person02");
		System.out.println(person2);
		
		System.out.println("===========list属性赋值==============");
		Person person3 = (Person)applicationContext.getBean("person03");
		System.out.println(person3);
		
		System.out.println("===========map属性赋值==============");
		Person person4 = (Person)applicationContext.getBean("person04");
		System.out.println(person4);
		
		System.out.println("===========properties属性赋值==============");
		Person person5 = (Person)applicationContext.getBean("person05");
		System.out.println(person5);
		
		System.out.println("===========util名称空间==============");
		Person person6 = (Person)applicationContext.getBean("person06");
		System.out.println(person6);
		
		System.out.println("===========级联属性操作==============");
		Person person07 = (Person)applicationContext.getBean("person07");
		System.out.println(person07);
		
		System.out.println("===========通过继承实现bean配置信息的重用==============");
		Person person09 = (Person)applicationContext.getBean("person09");
		System.out.println(person09);
	}
}
