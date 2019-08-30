package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//create an variable for the number of loops to assign item name and price to their array
		int quan = scan.nextInt();
		String[] itemname  = new String[quan];
		double[] price = new double[quan];

		//price and name assignment
		for (int i = 0; i < itemname.length; i++) {
			itemname[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		// creates variable for customer number, indicating the number of loops
		int customernumber = scan.nextInt();
		String[] customerfirstname = new String[customernumber];
		String[] customerlastname = new String [customernumber];
		int cquan = 0;
		double [] totalprice =  new double[customernumber];

		// scans through each individual customer, recording their quantity of specific item as well as name
		for (int i = 0; i < customernumber; i++) {
			customerfirstname[i] = scan.next();
			customerlastname[i] = scan.next();
			cquan = scan.nextInt();
			int[] itemquan = new int[cquan];
			String[] customeritemname = new String[cquan];
			//		scan.close();
			// assigning the total price per customer (each element) 
			for (int c = 0; c < cquan; c++) {
				itemquan[c] = scan.nextInt();
				customeritemname[c] = scan.next();
				for (int b = 0; b < quan; b++) {

					//				if (itemname[b].equals(scan.next()))
					if (itemname[b].equals(customeritemname[c])) {
						totalprice[i] = totalprice[i] + (itemquan[c] * price[b]);
//						System.out.println(totalprice[i]);
						//				scan.close();
					}

				}
			}
			
		}

		//		scan.close();
		// finds the biggest number and printing out customer name and total
		double biggestnumber = 0;
		biggestnumber = totalprice[0];
		int a = 0;
		for (int i = 0; i < totalprice.length; i++) {
			if (biggestnumber < totalprice[i]) {
				biggestnumber = totalprice[i];
//				System.out.println(customerfirstname[1]);
				a = i;
			

		}
		
	
		}
		System.out.println("Biggest: " + customerfirstname[a] + " " + customerlastname[a] + " (" + String.format("%.2f", biggestnumber) + ")");
//		System.out.println("Biggest:" + customerfirstname[i] + customerlastname[i] + "(" + String.format("%.2f", biggestnumber) + ")");
		// finding the smallest number and printing out customer name and total
		double smallestnumber = totalprice[0];
		int b = 0;
		for (int i = 0; i < totalprice.length; i++) {
			if (smallestnumber > totalprice[i]) {
				smallestnumber = totalprice[i];
		b = i;

		}
			
			
		}
		System.out.println("Smallest: " + customerfirstname[b] + " " + customerlastname[b] + " (" + String.format("%.2f", smallestnumber) + ")");
		// finding the average spend
//		System.out.println("Smallest:" + customerfirstname[i] + customerlastname[i] + "(" + String.format("%.2f", smallestnumber) + ")");
		double average = 0.0;
		for (int i = 0; i < totalprice.length; i++) {
			average += totalprice[i];
		}
		average = average / totalprice.length;
		System.out.println("Average" + ": " + String.format("%.2f", average));

	}
}