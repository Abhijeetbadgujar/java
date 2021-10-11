class CurtainStater{
public static void main(String[] args)
{
	Curtain ref=new Curtain();
	/*String colour=ref.getColour();
	System.out.println(colour);
	
	float thickness=ref.getThickness();
	System.out.println(thickness);
	
	String design=ref.getDesign();
	System.out.println(design);
	
	String quality=ref.getQuality();
	System.out.println(quality);*/
	
	//CurtainUsed curtainused=ref.getCurtainUsed();
	//System.out.println(CurtainUsed.DOOR);
	
	ref.setColour("black");
	System.out.println(ref.colour);
	
	ref.setThickness(12.4f);
	System.out.println(ref.thickness);
	
	ref.setDesign("babydoll");
	System.out.println(ref.design);
	
	ref.setQuality("bad");
	System.out.println(ref.quality);

}

}