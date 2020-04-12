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
		
		Person person = (Person)applicationContext.getBean("person01");
		System.out.println(person);
	}

}
