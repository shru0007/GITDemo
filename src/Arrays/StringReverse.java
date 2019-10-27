package Arrays;

public class StringReverse {
	public static void main(String[] args) {
		String str1 ="Shruthi";
		String revStr ="";
		for(int i = str1.length()-1; i>= 0; i--){
			revStr = revStr + str1.charAt(i);
		}
		System.out.println(revStr);
	}

}
