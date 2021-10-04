class IceCreamStater{
public static void main(String[] birthday)
{
	IceCream cream=new IceCream(-10,"plate",Colours.PINK);
		System.out.println(cream.flavour);
		System.out.println(cream.colour);
		System.out.println(cream.temp);
		System.out.println(cream.type);
		System.out.println(cream.brand);
		cream.type="cone";
		cream.brand=new Brands("amul","abhi",2000);
		System.out.println(cream.brand.name);
		System.out.println(cream.brand.ownername);
		System.out.println(cream.brand.since);
		
		/*String ref=cream.flavour;
		System.out.println(ref);
		
		float temp=cream.temp;
		Brand brand=cream.brand;
		String name=brand.name;
		String owername=brand.owername;
		String location=brand.location;
		int since=brand.since;
		brand.name="Amul";
		brand.owername="Abhi";
		brand.since=2000;
		System.out.println(name);
		System.out.println(owername);
		System.out.println(location);
		System.out.println(since);*/
		
}



}