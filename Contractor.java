class Contractor{
	private String name;
	private String constructor;
	private String position;
	private int noofsides;
	private int noofemployees;
	
	void setName(String name)
	{
	this.name=name;
	}
	String getName()
	{
		return this.name;
	}
	
	void setConstructor(String constructor)
	{
		this.constructor=constructor;
	}
	String getConstructor()
	{
		return this.constructor;
	}
	
	void setPosition(String position)
	{
		this.position=position;
	}
	String getPosition()
	{
		return this.position;
	}

	void setNoOfSides(int noofsides)
	{
		this.noofsides=noofsides;
	}
	int getNoOfSides()
	{
		return this.noofsides;
	}
	
	void setNoOfEmployees(int noofemployees)
	{
		this.noofemployees=noofemployees;
	}
	int getNoOfEmployees()
	{
		return this.noofemployees;
	}
}