package otherbean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean, DisposableBean {
	
	public void teaching() {
		System.out.println("Teaching is a good carrier");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Called First Before any method");
	}
	

	@Override
	public void destroy() throws Exception {
		System.out.println("Last But Not the least");
		
	}
	

}
