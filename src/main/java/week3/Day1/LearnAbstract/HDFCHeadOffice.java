package week3.Day1.LearnAbstract;

import week3.Day1.overriding.overridden;

public abstract class HDFCHeadOffice implements RBIGuidelines {
	
	public abstract void setMinValue();
	
	@overridden
	public void linkAdhaar() {
		System.out.println(" Adhaar is Linked ");
	}
	@overridden
	public void updatePAN() {
		System.out.println(" PAN is updated ");
	}

}
