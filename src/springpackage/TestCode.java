package springpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCode {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringFile.xml");
		Programmer programmer = (Programmer) context.getBean("programmerBean");
		programmer.codeStar();
	}
}
