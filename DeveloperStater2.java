class DeveloperStater2{
public static void main(String[] args)
{
	Developers2 ref=new Developers2();
	String name=ref.getName();
	System.out.println(name);

	String company=ref.getCompany();
	System.out.println(company);
	
	String project=ref.getProject();
	System.out.println(project);
	
	int noofdeveloper=ref.getNoOfDeveloper();
	System.out.println(noofdeveloper);
	
	String projectcountry=ref.getProjectCountry();
	System.out.println(projectcountry);
}
}