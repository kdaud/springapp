package codestar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	static {
		
	}
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Coder.xml");
		QualityAssurance qa = (QualityAssurance) context.getBean("qaBean");
		qa.mycodebudge();
	}
	
}
