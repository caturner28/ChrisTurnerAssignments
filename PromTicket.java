//Chris Turner p.2

import java.util.Scanner;

public class PromTicket {

		private String name = "";
		private String grade = "";
		private String type = "";
		private String amountDue = "";
		private int guestCount = 0;
		private double price = 0;
		private double payment = 0;
		
		public PromTicket() {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Student's name");
			name = keyboard.nextLine();
			
			System.out.println("Student's class");
			grade = keyboard.nextLine();
			
			System.out.println("Number of additional guests with this ticket");
			guestCount = keyboard.nextInt();
		
		System.out.println("The student needs a " + ticketType() + " ticket.");
		System.out.println("The student owes $" + ticketPrice());
		System.out.println("How much did the student pay?");
		payment = keyboard.nextDouble();
		System.out.println("You owe the student $" + transaction());
		
		keyboard.close();
		}
		
		public String ticketType() {
			if(guestCount == 0) {
				type = "solo";
			}
			
			else if(guestCount == 1) {
				type = "couple";
			}
			
			else if(guestCount == 2 || guestCount == 3) {
				type = "group";
			}
			
		return type;
		}
			
		public String ticketPrice() {
			if(type.equals("solo") && grade.equals("senior")) {
				amountDue = "40.00";
			}
			
			else if(type.equals("solo") && grade.equals("junior")) {
				amountDue = "45.00";
			}
			
			else if(type.equals("solo") && grade.equals("sophomore")) {
				amountDue = "55.00";
			}
			
			else if(type.equals("solo") && grade.equals("freshman")) {
				amountDue = "65.00";
			}
			
			else if(type.equals("couple") && grade.equals("senior")) {
				amountDue = "60.00";
			}
			
			else if(type.equals("couple") && grade.equals("junior")) {
				amountDue = "68.00";
			}
			
			else if(type.equals("couple") && grade.equals("sophomore")) {
				amountDue = "83.00";
			}
			
			else if(type.equals("couple") && grade.equals("freshman")) {
				amountDue = "98.00";
			}
			
			else if(type.equals("group") && grade.equals("senior")) {
				amountDue = "100.00";
			}
			
			else if(type.equals("group") && grade.equals("junior:")) {
				amountDue = "113.00";
			}
			
			else if(type.equals("group") && grade.equals("sophomore")) {
				amountDue = "138.00";
			}
			
			else if(type.equals("group") && grade.equals("freshman")) {
				amountDue = "163.00";
			}
		
		return amountDue;
	
		}
		 
		public double transaction () {
			 double price = Double.parseDouble(amountDue); //had to look up how to change string into double, I couldn't set "amountDue" equal
			 double amountPaid = payment;
			 double transaction = price - amountPaid;
			 double moneyDue = transaction * -1;
			 
		return moneyDue;
		 }
		
		public String confirmationCode() {
			int rand = 0;
			int count = 0;
			String confirmationCode = "";
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			while(count < 6) {
				rand = (int) (Math.random() * characters.length());
				confirmationCode += characters.substring(rand, rand + 1);
				count ++;
			}
			System.out.println("The student" + name + "purchased a " + grade + " " + ticketType() + " ticket that cost $" + ticketPrice() + ". The confirmation code is" + confirmationCode + ".");
		 
			
			 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
