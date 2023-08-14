class Customer{
	//---- Creating fields-----//
	private int customerid;
	private String customername;
	private char gender;
	
	//----Creating constructor------//
	Customer(int customerid, String customername, char gender){
		this.customerid=customerid;
		this.customername=customername;
		this.gender=gender;
	}
	
	//---Creating getters for instance variables----//
	public int getcustomerid(){
		return this.customerid;
	}
	public String getcustomername(){
		return this.customername;
	}
	public char getgender(){
		return this.gender;
	}
	
	//--Create toString method ---//
	public String toString(){
		return "\nCustomer ID :"+this.customerid+"\nCustomer Name :"+this.customername+"\nCustomer Gender :"+this.gender;
	}
}
