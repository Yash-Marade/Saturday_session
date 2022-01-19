import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/* It have groups of three characters separated by "_".
- Can only contain numbers 0-9 and characters a-z and A-Z.(other than "_")
- Contains 12 characters excluding the "_" 
    Sample id - ADI_239_Sep_B37 */

public class ID_Validate {
	public static void main(String[] args ) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id");
		String id = s.nextLine();
		
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
}


  