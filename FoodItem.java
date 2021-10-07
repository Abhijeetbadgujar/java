class FoodItem
{
	String name;
	int price;
	String hotelname;
	int quantity;
	int ratting;
	Type1 type1;
	OrderType ordertype;
	int totalprice;
	static int totalproductprice=3;

		FoodItem(String name,int price,String hotelname,int quantity,int ratting,Type1 type1,OrderType ordertype)
		{
			this.name=name;
			this.price=price;
			this.hotelname=hotelname;
			this.quantity=quantity;
			this.ratting=ratting;
			this.type1=type1;
			this.ordertype=ordertype;
		}
		/*FoodItem(String name,int price,String hotelname)
		{
			this.name=name;
			this.price=price;
			this.hotelname=hotelname;
			
		}*/
		void DisplayDetails()
		{
			System.out.println(this.name);
			System.out.println(this.price);
			System.out.println(this.hotelname);
			System.out.println(this.quantity);
		    System.out.println(this.ratting);
			System.out.println(this.type1);
			System.out.println(this.ordertype);
		}
		void printTotalprice()
		{
			int totalprice=this.quantity*this.price;
			System.out.println(totalprice);
			totalproductprice=totalproductprice+totalprice;
			System.out.println(totalproductprice);
		}
		static void printTotalFoodItemPrice()
		{
			System.out.println(totalproductprice);
			
		}
		
		


}