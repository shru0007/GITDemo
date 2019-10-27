
public class exceptionDEmo {


	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 0;


		try {
			int k = b / c;

		}
		
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("CAught arithematic exception !!!!!!");
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("delete cooooookiess");
		}

	}
}