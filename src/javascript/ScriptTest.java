package javascript;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScriptTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Javascript.xml");
		Javascript javascript = (Javascript) context.getBean("javascriptBean");
		javascript.printauthor();
	}
	
}
