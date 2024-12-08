package naming.java;

import java.util.List;

public class NormalClassName {

	private final int API_ID = 5314;
	private final String API_KEY = "test_api_key";
	
	private String firstName = "Mathis";
	private String lastName = "Neunzig";
	
	private List<String> list;
	
	public void addStuff() {
		System.out.println("A + B = C");
	}
	
	public void computeResult(Object result) {
		System.out.println("Result for "+result.toString()+" computed with api "+API_ID+" (key: "+API_KEY+")");
	}
}
