import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/* ID  - Can only contain numbers 0-9 and characters a-z and A-Z and "_"
       - Contains 15 characters including the "_" 
       - Sample id - aerd_23G34_De12 */

public class ID_Validate15 {
	public static void main(String[] args ) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id");
		String id = s.nextLine();
		
// Regula Expression  
	//	String idREgex = "\\w{15}";
		String idREgex = "[a-zA-Z_0-9]{15}";
	    
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


  