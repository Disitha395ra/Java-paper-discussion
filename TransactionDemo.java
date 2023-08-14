class TransactionDemo{
	public static void main(String args[]){
		Customer c1=new Customer(100112,"Mala",'F');
		Customer c2=new Customer(100115,"Vimal",'M');
		
		Account a1 = new Account(8001,c1,50000.00);
		Account a2 = new Account(8002,c2,25000.00);
		
		System.out.println("Coustomer 1\n"+a1.getcustomer().toString()+"\nBalance :"+a1.getaccountbalance());
		System.out.println("Coustomer 2\n"+a2.getcustomer().toString()+"\nBalance :"+a2.getaccountbalance());
		
		Transaction.deposittransaction(5000.00,a1);
		System.out.println("Deposite amount is Rs5000 \nDetails :\n"+a1.getcustomer().toString()+"\nBalance is :"+a1.getaccountbalance());
		Transaction.withdrawaltransaction(10000.00,a1);
		System.out.println("Withdrawal amount is Rs1000 \nDetails :\n"+a1.getcustomer().toString()+"\nBalance is :"+a1.getaccountbalance());
		
		System.out.println("Available Balance in Account 1: LKR " + a1.getaccountbalance());
        System.out.println("Available Balance in Account 2: LKR " + a2.getaccountbalance());
		
	}
}
