class IceCream{
	String flavour="vanilla";//literals
	Colours colour;//literals
	float temp;//const
	String type;//ref
	Brands brand;//ref
	
	IceCream(float temp)
	{
		this.temp=temp;
	}
	IceCream(float temp,String type,Colours colour)
	{
		this.temp=temp;
		this.type=type;
		this.colour=colour;
		
	}
}