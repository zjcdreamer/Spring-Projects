package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Person;

public class PersonTest02 {
	
	@Test
	public void test01() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application2.xml");
		System.out.println("===========����null==============");
		Person person = (Person)applicationContext.getBean("person01");
		System.out.println(person);
		
		System.out.println("===========�ڲ�bean==============");
		Person person2 = (Person)applicationContext.getBean("person02");
		System.out.println(person2);
		
		System.out.println("===========list���Ը�ֵ==============");
		Person person3 = (Person)applicationContext.getBean("person03");
		System.out.println(person3);
		
		System.out.println("===========map���Ը�ֵ==============");
		Person person4 = (Person)applicationContext.getBean("person04");
		System.out.println(person4);
		
		System.out.println("===========properties���Ը�ֵ==============");
		Person person5 = (Person)applicationContext.getBean("person05");
		System.out.println(person5);
		
		System.out.println("===========util���ƿռ�==============");
		Person person6 = (Person)applicationContext.getBean("person06");
		System.out.println(person6);
		
		System.out.println("===========�������Բ���==============");
		Person person07 = (Person)applicationContext.getBean("person07");
		System.out.println(person07);
		
		System.out.println("===========ͨ���̳�ʵ��bean������Ϣ������==============");
		Person person09 = (Person)applicationContext.getBean("person09");
		System.out.println(person09);
	}
}