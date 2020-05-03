package otherbeanapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEngineer {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Filling.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		Engineer engineer = (Engineer) context.getBean("engineerBean");
		engineer.engineer();
	}
	
}
