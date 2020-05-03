package beanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChoir {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Choir.xml");
		Choir choir = (Choir) context.getBean("choirBean");
		choir.singing();
	}
	
}
