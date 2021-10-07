class MovieTiket{
	String name;
	String theater;
	int price;
	int noofseats;
	String type;
	int totalprice;
	int totalcostprice;
	
	MovieTiket(String name,String theater,int price,int noofseats,String type)
	{
	this.name=name;
	this.theater=theater;
	this.price=price;
	this.noofseats=noofseats;
	this.type=type;
	System.out.println("invoked First method");
	}
	void DisplayDetails()
	{
	System.out.println("Mall name="+this.name);
	System.out.println("theater name="+this.theater);
	System.out.println("price="+this.price);
	System.out.println("noofseats="+this.noofseats);
	System.out.println("seats type="+this.type);
	}
	void PrintTotalPrice()
	{
	totalprice=this.price*this.noofseats;
	System.out.println("no.of seats price="+totalprice);
	totalcostprice=totalcostprice+totalprice;
	System.out.println("total cost="+totalcostprice);
	
	}

}