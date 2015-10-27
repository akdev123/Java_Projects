package javalearning;

public class StaticVariableUsage {
	
	public static String name = "I am a static variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.out.println(StaticVariableUsage.name);
	}

}

/*Without Using static Variable where we have to create object of the class
public class StaticVariableUsage {
	
	public String name = "I am a static variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		StaticVariableUsage obj = new StaticVariableUsage();
		
		System.out.println(obj.name);
	}

}

*/