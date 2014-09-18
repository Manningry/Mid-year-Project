public class ShippingBox
	{

	private double boxLength;
	private double boxWidth;
	private double boxHeight;
	

	public ShippingBox(double bL, double bW, double bH)
		{
		boxLength = bL;
		boxWidth = bW;
		boxHeight = bH;
		

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
