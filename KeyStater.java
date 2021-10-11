class KeyStater
{
public static void main(String[] args)
{
	Key ref=new Key();
	ref.setGadgets("bike");
	//String gadgets=ref.setGadgets;
	System.out.println(ref.gadgets);
	
	float thickness=ref.setThickness();
	System.out.println(thickness);
	
	ref.setThickness1(40.3f);
	System.out.println(ref.thickness1);

	Kichan ref1=new Kichan();
	ref1.setType("gun");
	System.out.println(ref1.type);
	
	ref1.setColour("black");
	System.out.println(ref1.colour);
	
	ref1.setSubstance("plastic");
	System.out.println(ref1.substance);
}
}