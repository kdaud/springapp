package otherbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Examination {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Chemistry.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		Teacher teacher = (Teacher) context.getBean("teacherBean");
		teacher.teaching();
	}
	
}
