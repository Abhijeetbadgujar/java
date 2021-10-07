class ProductStater1{
public static void main(String[] args)
{
	Product1 product=new Product1("fan","handfan",2500,2);
	product.DisplayDetails();
	product.printtotalcost();
	
	Product1 product1=new Product1("AC","digital",3000);
	product1.DisplayDetails();
	product1.printtotalcost();
	
	Product1.printTotalproductprice();
	
}
}