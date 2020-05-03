package beaninitdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("School.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		School school = (School) context.getBean("schoolBean");
		school.myschool();
		//school.destroy();
	}
	
}
