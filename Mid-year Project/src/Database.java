import java.util.ArrayList;
import java.util.Scanner;

public class Database {

	static ArrayList<ShippingBox> database = new ArrayList<ShippingBox>();

	public static void standardRates() {
		database.add(new ShippingBox(5.5, 3.5, 1, "1) Small Box"));
		database.add(new ShippingBox(8.5, 5.5, 1.5, "2) Medium Box 1"));
		database.add(new ShippingBox(12, 8, 6, "3) Medium Box 2"));
		database.add(new ShippingBox(14, 12, 3.5, "4) Large Box 1"));
		database.add(new ShippingBox(12, 12, 6, "5) Large Box 2"));

	}

	static int userAnswer;
	static int standardBoxChoice;
	static double userLength;
	static double userWidth;
	static double userHeight;
	static int userAnswer2;
	
	static double userWeight;
	static double shippingCost;
	static double userBoxCost;
	
	
	public static void Program() {

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Would you like to:");
		System.out.println("\t1) Purchase one of our standard sized boxes to use?");
		System.out.println("\t2) Use your own for a small fee?");
		System.out.println("");
		System.out.println("(Please enter 1 or 2)");
		userAnswer = userInput.nextInt();
		
		if(userAnswer == 1)//purchase a box
		{
			System.out.println("Great! Please enter the number of the standard box above that you would like to purchase. (1-5)");
			System.out.println("");
			standardBoxChoice = userInput.nextInt();
			
			//making sure standardBoxChoice has correct dimensions
			
			
			if(standardBoxChoice == 1)
				{
				System.out.println(database.get(0));
				}
			
			if(standardBoxChoice == 2)
				{
				System.out.println(database.get(1));
			
			if(standardBoxChoice == 3)
				{
				System.out.println(database.get(2));
				}
			
			if(standardBoxChoice == 4)
				{
				System.out.println(database.get(3));
				}
			
			if(standardBoxChoice == 5)
				{
				System.out.println(database.get(4));
				}
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("Is this correct? (Enter 1 for yes or 2 for no)");
			userAnswer2 = userInput.nextInt();
			
			
			if(userAnswer2 == 1)//info correct
			{
				System.out.println("Please enter the weight of the item(s) that you would like to ship. (In pounds)");
				userWeight = userInput.nextDouble();
				
				//price for buying standard box
				
				if(standardBoxChoice == 1)
				{
					userBoxCost = 3.50;
				}
				
				if(standardBoxChoice == 2)
				{
					userBoxCost = 4.50;
				}
				
				if(standardBoxChoice == 3)
				{
					userBoxCost = 6.00;
				}
				
				if(standardBoxChoice == 4)
				{
					userBoxCost = 7.50;
				}
				
				if(standardBoxChoice == 5)
					{
						userBoxCost = 9.50;
					}
				
				//price for box weight 
				
				if(userWeight <= 5)
				{
				shippingCost = 5;
				}
				
				if(userWeight <= 10 && userWeight > 5)
				{
				shippingCost = 10;
				}
				
				if(userWeight <= 20 && userWeight > 10)
				{
				shippingCost = 15;
				}
				
				if(userWeight > 20)
				{
				shippingCost = 25;
				}
				
				if(userWeight > 100)
					{
					shippingCost = 100;
					}
				
				System.out.println("A Breakdown of Your Total:");
				System.out.println("\t$" + userBoxCost +"0\tFor purchasing standard box " + standardBoxChoice);
				System.out.println("\t$" + shippingCost + "0\tBased on the weight of your box");
				System.out.println("");
				System.out.println("\tTOTAL: \t$" + (shippingCost + userBoxCost)+ "0");
			}
			
		
			if(userAnswer2 == 2)//info not correct
	
			System.out.println("Please re-enter the number of the standard box above that you would like to purchase. (1-5)");
			
			standardBoxChoice = userInput.nextInt();
			
			//making sure standardBoxChoice has correct dimensions (second time)
			
			if(standardBoxChoice == 1)
				{
				System.out.println(database.get(0));
				}
			
			if(standardBoxChoice == 2)
				{
				System.out.println(database.get(0));
				}
			
			if(standardBoxChoice == 3)
				{
				System.out.println(database.get(0));
				}
			
			if(standardBoxChoice == 4)
				{
				System.out.println(database.get(0));
				}
			
			if(standardBoxChoice == 5)
				{
				System.out.println(database.get(0));
				}
			
				System.out.println("");
				System.out.println("Please enter the weight of the item(s) that you would like to ship. (In pounds)");
				userWeight = userInput.nextDouble();
				
				//price for standard box
				
				if(standardBoxChoice == 1)
					{
						userBoxCost = 3.50;
					}
					
					if(standardBoxChoice == 2)
					{
						userBoxCost = 4.50;
					}
					
					if(standardBoxChoice == 3)
					{
						userBoxCost = 6.00;
					}
					
					if(standardBoxChoice == 4)
					{
						userBoxCost = 7.50;
					}
					
					if(standardBoxChoice == 5)
						{
							userBoxCost = 9.50;
						}
				
				//price for box weight 
				
				if(userWeight <= 5)
				{
				shippingCost = 5;
				}
				
				if(userWeight <= 10 && userWeight > 5)
				{
				shippingCost = 10;
				}
				
				if(userWeight <= 20 && userWeight > 10)
				{
				shippingCost = 15;
				}
				
				if(userWeight > 20)
				{
				shippingCost = 25;
				}
				
				if(userWeight > 100)
					{
					shippingCost = 100;
					}
				
				System.out.println("A Breakdown of Your Total:");
				System.out.println("\t$" + userBoxCost +"0\tFor purchasing standard box " + standardBoxChoice);
				System.out.println("\t$" + shippingCost + "0\tBased on the weight of your box");
				System.out.println("");
				System.out.println("\tTOTAL: \t$" + (shippingCost + userBoxCost)+ "0");
		}
		}
		
		if(userAnswer == 2)//use their own box
		{
			System.out.println("We can ship your own box for great rates!");
			System.out.println("");
			System.out.println("Please enter the dimensions of your box that you would like to ship.");
			System.out.println("");
			System.out.println("Length (in inches):");
			userLength = userInput.nextDouble();
			
			System.out.println("");
			System.out.println("Width (in inches):");
			userWidth = userInput.nextDouble();
			
			System.out.println("");
			System.out.println("Height (in inches):\t");
			userHeight = userInput.nextDouble();
			
			System.out.println("Here are the dimensions of your box:");
			System.out.println("");
			System.out.println("\tLength:\t" + userLength + "\"");
			System.out.println("\tWidth:\t" + userWidth + "\"");
			System.out.println("\tHeight:\t" + userHeight + "\"");
			System.out.println("");
			System.out.println("");
			System.out.println("Is this correct? (Enter 1 for yes or 2 for no)");
			userAnswer2 = userInput.nextInt();
			
			if(userAnswer2 == 1)//correct dimensions
			{
				System.out.println("Please enter the weight of the item(s) that you would like to ship.(In pounds)");
				userWeight = userInput.nextDouble();
				
				//Determine cost to ship based on weight
				if(userWeight <= 5)
				{
				shippingCost = 5;
				}
				
				if(userWeight <= 10 && userWeight > 5)
				{
				shippingCost = 10;
				}
				
				if(userWeight <= 20 && userWeight > 10)
				{
				shippingCost = 15;
				}
				
				if(userWeight > 20)
				{
				shippingCost = 25;
				}
				
				if(userWeight > 100)
					{
					shippingCost = 100;
					}
				
				//Determine cost to ship based on size
				
				if(userLength <= 6 && userWidth <= 6)
				{
					userBoxCost = 5;
				}
				
				if(userLength <= 6 && userWidth < 3)
				{
					userBoxCost = 2.50;
				}
				
				if((userLength <= 10 && userLength > 6)  && userWidth <= 6)
				{
					userBoxCost = 7.50;
				}
				
				if((userLength <15 && userLength > 10) && userWidth < 6)
				{
					userBoxCost = 10;
				}
				
				if((userLength <15 && userLength > 10) && userWidth > 6)
				{
					userBoxCost = 12.50;
				}
				
				if(userLength >=15 && userWidth <6)
				{
					userBoxCost = 15;
				}
				
				if((userLength >= 15) && userWidth >6)
				{
					userBoxCost = 20;
				}
				
				System.out.println("A Breakdown of Your Total:");
				System.out.println("\t$" + userBoxCost + "0\tTo ship a box with your size dimensions");
				System.out.println("\t$" + shippingCost + "0\tTo ship a box with your weight");
				System.out.println("");
				System.out.println("\tTOTAL: \t$" + (shippingCost + userBoxCost+"0"));
			}
				
			
			if(userAnswer2 == 2)//info not correct
			{
				System.out.println("Please re-enter the dimensions of your box that you would like to ship.");
				System.out.println("");
				System.out.println("Length (in inches):");
				userLength = userInput.nextDouble();
				
				System.out.println("");
				System.out.println("Width (in inches):");
				userWidth = userInput.nextDouble();
				
				System.out.println("");
				System.out.println("Height (in inches):\t");
				userHeight = userInput.nextDouble();
				
				System.out.println("Here are the dimensions of your box:");
				System.out.println("");
				System.out.println("\tLength:\t" + userLength + "\"");
				System.out.println("\tWidth:\t" + userWidth + "\"");
				System.out.println("\tHeight:\t" + userHeight + "\"");
				System.out.println("");
				System.out.println("");
				
				System.out.println("Please enter the weight of the item(s) that you would like to ship. (In pounds)");
				userWeight = userInput.nextDouble();
				
				//Determine cost to ship based on weight
				if(userWeight <= 5)
				{
				shippingCost = 5;
				}
				
				if(userWeight <= 10 && userWeight > 5)
				{
				shippingCost = 10;
				}
				
				if(userWeight <= 20 && userWeight > 10)
				{
				shippingCost = 15;
				}
				
				if(userWeight > 20)
				{
				shippingCost = 25;
				}
				
				if(userWeight > 100)
					{
					shippingCost = 100;
					}
				
				//Determine cost to ship based on size
				
				if(userLength <= 6 && userWidth < 6)
				{
					userBoxCost = 5;
				}
				
				if(userLength <= 6 && userWidth < 3)
				{
					userBoxCost = 2.50;
				}
				
				if((userLength <= 10 && userLength > 6)  && userWidth < 6)
				{
					userBoxCost = 7.50;
				}
				
				if((userLength <= 15 && userLength > 10) && userWidth < 6)
				{
					userBoxCost = 10;
				}
				
				if((userLength >15) && userWidth >6)
				{
					userBoxCost = 20;
				}
				
				System.out.println("A Breakdown of Your Total:");
				System.out.println("\t$" + userBoxCost + "0\tTo ship a box with your size dimensions");
				System.out.println("\t$" + shippingCost + "0\tTo ship a box with your weight");
				System.out.println("");
				System.out.println("\tTOTAL: \t$" + (shippingCost + userBoxCost+"0"));
			}
		}
		}
		
		

	

	public static void ProgramIntro() {

		System.out.println("");
		System.out.println("Welcome to the Denver-Area Postal Office! Our standard sized boxes are as follows:");
		System.out.println("");
		System.out.println("");
		
		for (ShippingBox showPrices : database) {
			
				System.out.print("  *  ");
				System.out.println(showPrices.getboxName() + "\tLength:\t" + showPrices.getBoxLength() +"\""
						+ "\tWidth:" + "\t" + showPrices.getBoxWidth() + "\""
						+ "\tHeight:" + "\t" + showPrices.getBoxHeight() + "\"");
				System.out.println("");
				System.out.println("");
			}
		
		
		
		
		}


	
}

