package otherbeanapplication;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Engineer {
	
	public void engineer() {
		System.out.println("Physics and Mathematics are the core subjects");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initializing bean programm");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying the bean just right now");
	}
	
}
