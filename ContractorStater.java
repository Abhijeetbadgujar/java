class ContractorStater{

public static void main(String[] args)
{
	Contractor contractor=new Contractor();
	contractor.setName("Gomu");
	String name=contractor.getName();
	System.out.println(name);
	
	contractor.setConstructor("taj Hotel");
	String constructor=contractor.getConstructor();
	System.out.println(constructor);
	
	contractor.setPosition("seniour");
	String position=contractor.getPosition();
	System.out.println(position);
	
	contractor.setNoOfSides(12);
	int noofsides=contractor.getNoOfSides();
	System.out.println(noofsides);

	contractor.setNoOfEmployees(100);
	int noofemployees=contractor.getNoOfEmployees();
	System.out.println(noofemployees);
}

}