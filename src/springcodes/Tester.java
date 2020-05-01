package springcodes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Dependency.xml");
		Technology technology = (Technology) context.getBean("technologyBean");
		technology.showcode();
	}
	
}
