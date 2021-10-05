class ApplicationStater{
public static void main(String[] args)
{
	Application ref=new Application();
	ref.name="Deutsche Mark";
	ref.version="5G";
	ref.displayDetails();									
ref.company= new Company();
Company comp=ref.company;
	comp.name="Deutch";
	comp.ceo="Christian Sewing";
	comp.cfo="James von Moltke";
	comp.displayDetails();
comp.countrys=new Countrys();
Countrys count=comp.countrys;
	count.name="Germany";
	count.code=431001;
	count.displayDetails();
	
	Application ref1=new Application();
	ref1.name="alibaba";
	ref1.version="13pro";
	ref1.displayDetails();
ref1.company=new Company();
Company comp1=ref1.company;
	comp1.name="Alibaba Group";
	comp1.ceo="Daniel Zhang";
	comp1.cfo="Maggie Wu";
	comp1.displayDetails();
comp1.countrys=new Countrys();
Countrys count1=comp1.countrys;	
	count1.name="chaina";
	count1.code=143143;
	count1.displayDetails();
	
	Application ref2=new Application();
	ref2.name="flipkart";
	ref2.version="2pro";
	ref2.displayDetails();
ref2.company=new Company();
Company comp2=ref2.company;
	comp2.name="flipkart group";
	comp2.ceo="Kalyan Krishnamurthy";
	comp2.cfo="Sriram Venkataraman";
	comp2.displayDetails();
comp2.countrys=new Countrys();
Countrys count2=comp2.countrys;
	count2.name="india";
	count2.code=143214;
	count2.displayDetails();
	
Application ref3=new Application();
	ref3.name="amazon";
	ref3.version="3pro";
	ref3.displayDetails();
ref3.company=new Company();
Company comp3=ref3.company;
	comp3.name="flipkart group";
	comp3.ceo="Andy Jassy";
	comp3.cfo="Brian T. Olsavsky";
	comp3.displayDetails();
comp3.countrys=new Countrys();
Countrys count3=comp3.countrys;
	count3.name="America";
	count3.code=1434314;
	count3.displayDetails();
}


}

