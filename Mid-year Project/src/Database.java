import java.util.ArrayList;
import java.util.Scanner;

public class Database
	{

static ArrayList <ShippingBox> database = new ArrayList<ShippingBox>();
		
public static void standardRates()
	{
database.add(new ShippingBox(5.5, 3.5, 1));
database.add(new ShippingBox(8.5, 5.5, 1.5));
database.add(new ShippingBox(12, 8, 6));
database.add(new ShippingBox(14, 12, 3.5));
database.add(new ShippingBox(12, 12, 6));

	}

public static void userBox()
	{
	
	Scanner userInput = new Scanner(System.in);
	
	double userLength = userInput.nextDouble();
	double userWidth = userInput.nextDouble();
	double userHeight = userInput.nextDouble();
	
	
	}

public static void runProgram()
	{
	
	System.out.println("Welcome to the Denver-Area Postal Office! Our standard sized boxes are as follows:");

	for(ShippingBox showPrices : database)
		{
		System.out.println("SMALL BOX" + "\tLength: " + "\t" + showPrices.getBoxLength() + "\tWidth" + "\t" + showPrices.getBoxWidth() + "\tHeight" + "\t" + showPrices.getBoxHeight());
		}
	
	}

	}
