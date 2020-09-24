/**
 *Author: Chris Turner
 *Date: Sep 22, 2020
 *Description: 
 */
import java.util.Scanner;

public class ChrisTurnerUnit1project {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner keyboard = new Scanner(System.in);
			String firstname;
			String middlename;
			String lastname;
			String birthdate;
		
			System.out.println("What is your first name?");
			firstname = keyboard.nextLine();
			
			System.out.println("What is your middle name?");
			middlename = keyboard.nextLine();
			
			System.out.println("What is your last name");
			lastname = keyboard.nextLine();
			
			System.out.println("Your full name is:" + firstname + " " + middlename + " " + lastname);
			
			String firstletterfn = firstname.substring(0,1).toUpperCase();
			String firstlettermn = middlename.substring(0,1).toUpperCase();
			String lastnamelc = lastname.toLowerCase();
			
			System.out.println("What is your birthday?, Please write enter it as so: mm-dd-yyyy");
			birthdate = keyboard.nextLine();
			
			System.out.println( );
			System.out.println("Your email and password is:");
			System.out.println( );
			System.out.println("Email:" + " " + lastnamelc + firstletterfn + firstlettermn + "@sharkmail.com");
			System.out.println("Temp Password:" + " " + birthdate.substring(0,2) + birthdate.substring(3,5) + birthdate.substring(6));
			System.out.println("*** This temporary password is very insecure. Please change it immediatly! ***");
			
			
			
			
			
			
		
		
	}

}
