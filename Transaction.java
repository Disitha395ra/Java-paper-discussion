class Transaction{
	
	
	
	//--Methods--//
	public static String deposittransaction(double depositamount, Account account){
		double currentbalance=account.getaccountbalance();
		double newbalance=currentbalance+depositamount;
		account.setaccountbalance(newbalance);
		
		return "\nDeposite :"+depositamount+"\nIn to account :"+account.
		getaccountnumber()+"\nNew balance :"+newbalance;
	}
	
	public static String withdrawaltransaction(double withdrawalamount, Account
	 account){
		double currentbalance=account.getaccountbalance();
		double balance=currentbalance-withdrawalamount;
		account.setaccountbalance(balance);
		
		return "\nWithdrawal :"+withdrawalamount+"\n Account :"+account.
		getaccountnumber()+"\n New balance :"+balance;
	}
	
	public String checkbalance( Account account){
		return "Account :"+account.getaccountnumber()+"\nBalance :"+account.
		getaccountbalance();
	}
	
	
}
