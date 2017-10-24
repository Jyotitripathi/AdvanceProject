package com.auribises;

public class UberUser extends User{
	
	int walletBal;
	String address;
	
	public UberUser() {
		walletBal = 0;
		address = "NA";
	}
	
	public int getWalletBal() {
		return walletBal;
	}
	public void setWalletBal(int walletBal) {
		this.walletBal = walletBal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UberUser [walletBal=" + walletBal + ", address=" + address + "]";
	}

	@Override
	void insertUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void retrieveUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void createGroup() {
		// TODO Auto-generated method stub
		
	}
	
	
}
