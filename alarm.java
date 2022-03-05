
import java.util.Scanner;


public class alarm {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day(from 0 to 6) :");
		int day = sc.nextInt();
		System.out.println("Enter true or false for vacation ");
		boolean vacation = sc.nextBoolean();
		if ( day == 0 || day == 1 || day == 2 || day == 3 || day == 4 ) {
			if(vacation == false) {
				System.out.println("7:00 AM");
			} else {
				System.out.println("10:00 AM");
			}
			
		} else if(day == 5 || day == 6) {
			System.out.println("OFF");
			
		}
			
		}
		
		
		
	}
 

