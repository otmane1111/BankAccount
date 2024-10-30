public class main{
    public static void main(String[] args) {

		
	BankAccount account1 = new BankAccount();
	//account1.setaccountId("36403287");;
	account1.setcurrency("MAD");
	account1.setbalance(7600);
	
	BankAccount account2 = new BankAccount("MAD",1299);
	printAccount(account1);
	System.out.println("=========================");;
	printAccount(account2);
	 }
	
	public static void printAccount (BankAccount account ){
	
	System.out.println("*******************************");
	System.out.println("account id ="+account.getaccountId());
	System.out.println("balance ="+account.getbalance());
	System.out.println("status ="+account.getStatus());
	System.out.println("currency ="+account.getaccountId());
	System.out.println(account.toString());
	System.out.println(account.hashCode());
	System.out.println(account.equals(account));
	}


}
