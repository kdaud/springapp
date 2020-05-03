package beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterQa {
	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("Spring.xml");
		
		Programmer programmer = (Programmer) content.getBean("programmerBean");
		programmer.setWelcometoGsoc("He love java programming and javascript");
		programmer.googlesummerofcodes();
		
		Programmer programmer2 = (Programmer) content.getBean("programmerBean");
		programmer2.googlesummerofcodes();
	}
	
}
