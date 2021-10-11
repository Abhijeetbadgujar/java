class Curtain{
	//private CurtainUsed curtainused;
	private String colour="yellow";
	private float thickness=10.3f;
	private String design="doll";
	private String quality="good";
	
	String getColour()
	{
		return this.colour;		
	}
	float getThickness()
	{
		return this.thickness;
	}
	String getDesign()
	{
		return this.design;
	}
	String getQuality()
	{
		return this.quality;
	}
	/*CurtainUsed curtainused()
	{
		return this.curtainused;
	}*/
	 
	 String colour;
	 float thickness;
	 String design;
	 String quality;
	
	void setColour(String colour)
	{
		this.colour=colour;		
	}
	void setThickness(float thickness)
	{
		this.thickness=thickness;
	}
	void setDesign(String design)
	{
		this.design=design;
	}
	void setQuality(String quality)
	{
		this.quality=quality;
	}
	//void setCurtainUsed()
	
}