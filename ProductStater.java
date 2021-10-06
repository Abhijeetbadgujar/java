class ProductStater{
public static void main(String[] agrs)
{
	Product product=new Product();
	product.name="beer";
	product.type="tuber";
	product.price=190;
	product.quantity=190.3f;
	product.DisplayDetails();
	

product.vendor=new Vendor();
Vendor ven=product.vendor;
	ven.name="Abhi";
	ven.location="banglore";
	ven.DisplayDetails();

}

}