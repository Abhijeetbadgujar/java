package com.xworkz.bridge.VotingRules.citizen;

import com.xworkz.bridge.VotingRules.Hospital;
import com.xworkz.bridge.VotingRules.HospitalAdmitRule;
import com.xworkz.bridge.VotingRules.HospitalDischargeRules;
import com.xworkz.bridge.VotingRules.Patient;

public class HospitalRules {

	public static void main(String[] args) {

		HospitalAdmitRule admitRule=new Patient();
		HospitalDischargeRules dischargeRules=new Patient();
		admitRule.payAdvance();
		dischargeRules.discount();
		Hospital hospital=new Hospital("maharashtra","aurangabad",true,"don't wake up","pay the fees and then go");
		hospital.allowPatient();
		
		
	}

}
