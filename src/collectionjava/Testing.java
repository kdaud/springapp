package collectionjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Fullstack.xml");
		Collect collect = (Collect) context.getBean("fullstuckBean");
		collect.mycodingjourney();
	}
	
}
