package a1;

		import java.util.Scanner;

		public class A1Novice {

			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);

				// Your code follows here.
				int loopnumber = scan.nextInt();
				for (int i=0; i <= loopnumber; i++) {
					System.out.println(scan.next() + ":");
					System.out.println(scan.next() + ":");
					loopnumber = scan.nextInt();
					double totalamount = 0;
					for (int j=0; j <= loopnumber; j++) {
						int amount = scan.nextInt();
						double price = scan.nextDouble();
						double[] prices = new double[price];
						
						for (int k=0; k<=loopnumber; k++ ) {
							prices[k] = amount * price;
							amount = scan.nextInt();
							price = scan.nextDouble();
							
							for (int l=0; l<prices.length; l++) {
								double totalamount = totalamount + prices[l];
								System.out.println(totalamount);
								
							}
						}
					
					}
					scan.close();
				}
				
			}
		}