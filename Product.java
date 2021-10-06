class Product{
	String name;
	String type;
	int price;
	float quantity;
	Vendor vendor=new Vendor();
	
	void DisplayDetails()
	{
	System.out.println(name);
	System.out.println(type);
	System.out.println(price);
	System.out.println(quantity);
	
	
	}



}