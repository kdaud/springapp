package settermethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("File.xml");
		Student student = (Student) context.getBean("studentBean");
	
		student.coding();
	}
	
}
