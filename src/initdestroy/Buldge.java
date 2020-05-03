package initdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Buldge {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConf.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		Developer developer = (Developer) context.getBean("developerBean");
		developer.showdeveloper();
	}
}
