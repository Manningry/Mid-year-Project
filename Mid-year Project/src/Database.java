
public class Database
	{

private double boxLength;
private double boxHeight;
private double boxWidth;
private double boxWeight;
private String boxDestination;
	
public Database(double bL, double bH,double bW, double bWe, String bD)
	{
	boxLength = bL;
	boxHeight = bH;
	boxWidth = bW;
	boxWeight = bWe;
	boxDestination = bD;
	
	System.out.println("");
	}

public double getBoxLength()
	{
	return boxLength;
	}

public void setBoxLength(double boxLength)
	{
	this.boxLength = boxLength;
	}




	}
