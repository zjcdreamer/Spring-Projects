package test;
import bean.Person;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		
		Person person1 = applicationContext.getBean("person01", Person.class);
		//Person person2 = applicationContext.getBean(Person.class);
		Person person3 = (Person)applicationContext.getBean("person01");
		System.out.println(person3);
		Person person4 = (Person)applicationContext.getBean("person07");
		System.out.println(person4);
	}
	
	

}
