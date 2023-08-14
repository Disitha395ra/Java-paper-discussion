class Account{
	//--Creating fields--//
	private int accountnumber;
	private Customer customer;
	private double accountbalance;
	
	//--Creating Constructor---//
	Account(int accountnumber,Customer customer,double accountbalance){
		this.accountnumber=accountnumber;
		this.customer=customer;
		this.accountbalance=accountbalance;
	}
	
	//--Creating constructor with account balanece 2000---//
	Account(double accountbalance){
		this.accountbalance=2000;
	}
	
	//--Getters for each fields---//
	public int getaccountnumber(){
		return this.accountnumber;
	}
	public Customer getcustomer(){
		return this.customer;
	}
	public double getaccountbalance(){
		return this.accountbalance;
	}
	
	//--Setters for each fields--//
	public void setaccountnumber(int accountnumber){
		this.accountnumber=accountnumber;
	}
	public void setcustomer(Customer customer){
		this.customer=customer;
	}
	public void setaccountbalance(double accountbalance){
		this.accountbalance=accountbalance;
	}
	
	//--Create boolean method check balance--//
	public boolean isbalance(){
		if(accountbalance>0){
			return true;
		}else{
			return false;
		}
	}
	
	//--Create toString method--//
	public String toString(){
		return "\nCustomer detail :"+customer.toString()+"\nAccount number :"+this.accountnumber+"\nAccount balance :"+this.accountbalance;
	}
	
}
