class Product1
{
	String name;
	String type;
	float price;
	int quantity;
	String vendor;
	float total;
	static float totalproductprice=0;
	
	
	Product1(String name,String type,float price,int quantity)
	{
		this.name=name;
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		this.vendor=vendor;
		System.out.println("first method");
	}
	Product1(String name,String type,float price)
	{
		this.name=name;
		this.type=type;
		this.price=price;
		System.out.println("second method");
	}
	void DisplayDetails()
	{
		System.out.println("product name="+this.name);
		System.out.println("product type="+this.type);
		System.out.println("fan price="+this.price);
		System.out.println("fan quantity="+this.quantity);
		System.out.println("vendor name="+this.vendor);
	}
	void printtotalcost()
	{
		float total=this.price*this.quantity;
		System.out.println("quantity price="+total);
	    totalproductprice=totalproductprice+total;
		System.out.println("totalproductprice="+totalproductprice);
	}
	static void printTotalproductprice()
	{
		System.out.println("static totalproductprice="+totalproductprice);
	}


}