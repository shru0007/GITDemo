
public class StringConcept {
	
	public static void main(String[] args) {
//		String str = "Payment $100 paid";
//		System.out.println(str.charAt(10));
//		System.out.println("\n" + str.indexOf("$"));
//		
//		System.out.println(str.substring(8, 12));
		String revStr = "" ;
		
		String str ="Shruthi";
		System.out.println(str.length());
		for (int i = str.length()-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
			
		}
		System.out.println(revStr);
		
		if(str.equalsIgnoreCase(revStr)){
			System.out.println("Same Bro!!");
		}
		else
			System.out.println("NOTTTT same bro!!!!!!!!");
		}

}
