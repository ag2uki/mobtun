package com.bni46;

public class MobtunRequest {
	public String cifNum;
	public String accountNum;
	public int amount;
	public int expiredIn;
	public String phoneNum;
	
	public MobtunRequest() {}
	
	public MobtunRequest(String cifNum, 
				String accountNum, 
				int amount,
				int expiredIn,
				String phoneNum) {
		
		this.cifNum = cifNum;
		this.accountNum = accountNum;
		this.amount = amount;
		this.expiredIn = expiredIn;
		this.phoneNum = phoneNum;				
	}
}