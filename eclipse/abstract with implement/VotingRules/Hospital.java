package com.xworkz.bridge.VotingRules;

public class Hospital {
	private String stateName;
	private String location;
	private boolean govt;
	private String HospitalAdmitRule;
	private String HospitalDischargeRule;

	public Hospital() {
		System.out.println("Invoked the hosital constructor which is no-arg");
	}

	public Hospital(String stateName, String location, boolean govt, String hospitalAdmitRule,
			String hospitalDischargeRule) {
		super();
		this.stateName = stateName;
		this.location = location;
		this.govt = govt;
		HospitalAdmitRule = hospitalAdmitRule;
		HospitalDischargeRule = hospitalDischargeRule;

	}

	public void allowPatient() {
		System.out.println("invoked the allowpatient");
		if(this.HospitalAdmitRule!=null) {
			System.out.println("invoked the hospital admit rules");
			String register=this.HospitalAdmitRule.rigister();
			System.out.println("patient register"+register);
			double payAdvance=this.HospitalDischargeRule.payAdvance();
			System.out.println("first pay advance fees:"+payAdvance);
			boolean validInsurance=this.HospitalAdmitRule.validInsurance();
			System.out.println("patient valid insurance:"+validInsurance);
			if(payAdvance>=20 && validInsurance==true) {
				System.out.println("pay advance");
				if(validInsurance) {
					System.out.println("insurance is their so no need to pay");
					return true;
				}
				else {
					System.err.println("insurance not then its dead");
				}
			}
		}
		return false;
	}
}