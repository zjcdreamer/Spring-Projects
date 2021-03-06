package bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private String name;
	private int age;
	private String gender;
	private String email;
	private Car car;
	private Properties properties;
	private List<Book> books;
	private Map<String, Object> mpas;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Map<String, Object> getMpas() {
		return mpas;
	}
	public void setMpas(Map<String, Object> mpas) {
		this.mpas = mpas;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + ", car=" + car
				+ ", properties=" + properties + ", books=" + books + ", mpas=" + mpas + "]";
	}
	public Person(String name, int age, String gender, String email, Car car, Properties properties, List<Book> books,
			Map<String, Object> mpas) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.car = car;
		this.properties = properties;
		this.books = books;
		this.mpas = mpas;
	}
	public Person() {
		super();
		System.out.println("Person������");
	}
	
	
}
