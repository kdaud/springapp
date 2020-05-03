package collectionjava;

import java.util.List;

public class Collect {
	
	private List<String> listofcoder;
	
	public void setListofcoder(List<String> listofcoder) {
		this.listofcoder = listofcoder;
	}
	
	public void mycodingjourney() {
		System.out.println("Names of core devs: " + listofcoder);
	}
	
}
