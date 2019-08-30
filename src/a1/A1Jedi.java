package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//create an variable for the number of loops to assign item name and price to their array
				int quan = scan.nextInt();
				String[] itemname  = new String[quan];
				double[] price = new double[quan];
				int[] amt = new int[quan];
				int[] numbercustbought = new int[quan];
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
				
				// scans through each individual customer, recording their quantity of specific item as well as name
//				boolean newCustomer = true;
				
				for (int i = 0; i < customernumber; i++) {
					boolean[] hello = new boolean[quan];
					for (int y = 0; y < hello.length; y++) {
						hello[y] = false;
					}
					
					customerfirstname[i] = scan.next();
					customerlastname[i] = scan.next();
					cquan = scan.nextInt();
					int[] itemquan = new int[cquan];
					String[] customeritemname = new String[cquan];
//					boolean firstroundIsover = true;
					// assigning the total price per customer (each element) 
					for (int c = 0; c < cquan; c++) {
//						String current = customerfirstname[i];
						itemquan[c] = scan.nextInt();
						customeritemname[c] = scan.next();
//						int samecustomer = i;
//						boolean firstroundIsover = true;
//						boolean hit = false;
						for (int b = 0; b < quan; b++) {
							if (itemname[b].equals(customeritemname[c])) {
								amt[b] = amt[b] + (itemquan[c]);
								
								if (hello[b] == false) {
									numbercustbought[b] += 1;
									hello[b] = true;
								}
							}
							
//								String compare = customeritemname[0];
//								for (int n=0; n < cquan; n++) {
//									if (compare.equals(customeritemname[n+1])) {
//										numbercustbought[b] = numbercustbought[b] - 1;
//								}
//							}
						}
								
//						}
//					for (int n = 0; n < cquan; n++) {
//						
//					}
					}
					
				}
				for (int i = 0; i < quan; i++) {
					if (amt[i] > 0) {
						System.out.println(numbercustbought[i] + " customers bought " + amt[i] + " " + itemname[i]);
						}else{
							System.out.println( "No " + " customers bought " + " " + itemname[i]);
						}
				}
	}
				}

