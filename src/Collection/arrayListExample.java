package Collection;

import java.util.ArrayList;

public class arrayListExample {
	public static void main(String[] args) {
		ArrayList<String> arL= new ArrayList<String>();
		arL.add("Shruthi");
		arL.add("Raj");
		arL.add(0, "Employee");
		arL.remove(1);
		arL.contains("Raj");
		arL.indexOf("Raj");
		

		System.out.println(arL);
		System.out.println(arL.indexOf("Raj"));
		System.out.println(arL.size());
		
	}

}
