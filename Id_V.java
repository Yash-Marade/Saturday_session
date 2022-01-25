import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Id_V {
		public static void ValidateIdWith12Chars(String id) {
		
		
// Regula Expression  
		String idREgex = "[a-zA-Z0-9]{3}[_][a-zA-Z0-9]{3}[_][a-zA-Z0-9]{3}[_][a-zA-Z0-9]{3}";
	    
// compile method from regex
		Pattern pt = Pattern.compile(idREgex);
// match method from regex
		Matcher mt = pt.matcher(id);
		
		boolean result = mt.matches();
		
		if(result) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");

		}
		//	System.out.println(result);
	}
	
	public static void ValidateIdWithAnyLength(String id) {
		
// Regula Expression  
		String idREgex = "\\w{15}";

	    
// compile method from regex
		Pattern pt = Pattern.compile(idREgex);
// match method from regex
		Matcher mt = pt.matcher(id);
		
		boolean result = mt.matches();
		
		if(result) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");

		}
//	System.out.println(result);
	}
	
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id.:");
		String id = s.nextLine();
		ValidateIdWith12Chars(id);
		ValidateIdWithAnyLength(id);
		
	}

}
