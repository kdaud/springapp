package springcodes;


public class Technology {
	
	Subject subject;
	
	public Technology(Subject subject) {
		this.subject = subject;
	}
	
	public void showcode() {
		subject.coursestudy();
	}
	
}
