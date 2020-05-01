package programmer;

import techcarrier.MainTester;

public class Tester {
	
	public static void main(String[] args) {
		Entusiasts obj = new Entusiasts();
		int myage = obj.age = 18;
		obj.setId(10);
		System.out.println("He is " + obj.getInt() + " years old");
		System.out.println("My Brother is " + myage);
		showcase();
	}
	
	public static void showcase() {
		new MainTester();
		

	}
	
}
