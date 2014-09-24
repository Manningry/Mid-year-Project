public class ShippingBox
	{

	
	private double boxLength;
	private double boxWidth;
	private double boxHeight;
	private String boxName;

	public ShippingBox(double bL, double bW, double bH, String bN)
		{
		
		boxLength = bL;
		boxWidth = bW;
		boxHeight = bH;
		boxName = bN;

		}

	public String toString()
		{
		return "You Chose:\t" + "\n\n" + boxName + "\n" +
		 "\n\tLength:\t  " + boxLength + "\"" +
		 "\t\n\tWidth:\t  " + boxWidth + "\"" +
		 "\t\n\tHeight:\t  " + boxHeight + "\"";
	
		
		}
	
	
	public String getboxName()
		{
		return boxName;
		}
	
	public void setBoxName(String boxName)
		{
		this.boxName = boxName;
		}
	
	public double getBoxLength()
		{
		return boxLength;
		}

	public void setBoxLength(double boxLength)
		{
		this.boxLength = boxLength;
		}

	public double getBoxHeight()
		{
		return boxHeight;
		}

	public void setBoxHeight(double boxHeight)
		{
		this.boxHeight = boxHeight;
		}

	public double getBoxWidth()
		{
		return boxWidth;
		}

	public void setBoxWidth(double boxWidth)
		{
		this.boxWidth = boxWidth;
		}

	

	}
