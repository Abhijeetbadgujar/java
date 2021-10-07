class FoodItemStater{
public static void main(String[] args)
{
	FoodItem fooditem=new FoodItem("dosa",200,"udapy",3,4,Type1.VEG,OrderType.ONLINE);
	
	fooditem.DisplayDetails();
	fooditem.printTotalprice();
	fooditem.printTotalFoodItemPrice();
	
	
	/*FoodItem fooditem1=new FoodItem("samosa",300,"dhamal");
	
	fooditem1.DisplayDetails();
	fooditem1.printTotalprice();
	fooditem1.printTotalFoodItemPrice();
	*/
	
	FoodItem.printTotalFoodItemPrice();
}



}