package a1;

		import java.util.Scanner;

		public class A1Novice {

			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);

				// Your code follows here.
				int numberOfcustomers = scan.nextInt(); // sets the variable for the amount of loops, each customer = one loop
				for (int i=0; i < numberOfcustomers; i++) {// prints out the customer name
					String firstname = scan.next();
					String lastname = scan.next();
					char z = firstname.charAt(0);
					int totalAmountitems = scan.nextInt(); // sets a variable for total amount of items bought per customer
					double totalamount = 0; // sets a variable for the total amount
					for (int j=0; j < totalAmountitems; j++) { // a for loop for the number for the # of total items bought, quantity and price		
						int quantity = scan.nextInt(); // sets a variable for the quantity of a specific item
						String name = scan.next();
						double price = scan.nextDouble(); //sets a variable to store the price of each item
						totalamount += price * quantity;
					}
					System.out.println(z + "." + " " + lastname + ": " + String.format("%.2f", totalamount));
//								
							}
				scan.close();
			}
					
				
			
				
		}
			
		