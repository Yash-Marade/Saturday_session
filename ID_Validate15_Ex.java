import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ID_Validate15_Ex {
	public static void main(String[] args ) {
		
		String[] ids = {"Abc_1_1fg3_eg55M","_we12_erer_0000","reds_234#@","$fh_223_323-243","ADI_239_Sep_B37"};
		
		
		String idREgex = "\\w{15}";

	    Pattern pt = Pattern.compile(idREgex);
	    
	    for(String id : ids) {
	    	 System.out.println(id + "    is   " + (pt.matcher(id).matches() ? "valid" : "invalid"));
		
		

		}

	}
}


  