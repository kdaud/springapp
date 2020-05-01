package settermethod;


public class Student {
	
	Learner learner;
	
	public void setLearner(Learner learner) {
		this.learner = learner;
	}
	
	public void coding() {
		learner.school();
	}
	
}
