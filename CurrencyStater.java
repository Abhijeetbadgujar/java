class CurrencyStater{
public static void main(String[] args)
{
	Currency ref=new Currency();
	ref.name="Euro";
	//ref.Country="Germany";
	ref.value=12000;
	ref.displayDetails();
	
ref.countrys=new Countrys();
Countrys country=ref.countrys;

	country.name="Germany";
	country.code=4310;
	country.displayDetails();


}




}