package appPoly;

import java.sql.Timestamp;

public class AccBean {
	private long accountNumber =1001;
	private String accountName="Ronaldo";   //-----Data Hiding thru private
	private Timestamp registerTime ;
	
	public long getAccountNumber() {  //-- Encapsultaion 
		return accountNumber; // Encapsulating private data inside public method
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Timestamp getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}
	
	
	

}
