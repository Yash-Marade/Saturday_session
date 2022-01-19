import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ID_Validate {
	public static void main(String[] args ) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id");
		String id = s.nextLine();
		
		// Regula Expression 
		String idREgex = "[a-zA-Z0-9]{3}[_][a-zA-Z0-9]{3}[_][a-zA-Z0-9]{3}[_][a-zA-Z0-9]{3}";
	    
		//compile method from regex
		Pattern pt = Pattern.compile(idREgex);
		//match method from regex
		Matcher mt = pt.matcher(id);
		
		boolean result = mt.matches();
		
		if(result) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");

		}
		//	System.out.println(result);
	}
}


  