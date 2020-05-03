package beanfactory;


public class Choir {
	
	private String welcomeCoder;
	
	public void setWelcomeCoder(String welcomeCoder) {
		this.welcomeCoder = welcomeCoder;
	}
	
	public void singing() {
		System.out.println(welcomeCoder);
	}
}
