public class main{
    public static void main(String[] args) {

		
	BankAccount account1 = new BankAccount();
	account1.setaccountId("1132332");
	account1.setcurrency("MAD");
	account1.setbalance(7600);
	
	printAccount(account1);
	 
	 }
	
	public static void printAccount (BankAccount account ){
	
	System.out.println("*******************************");
	System.out.println("account id ="+account.getaccountId());
	System.out.println("balance ="+account.getbalance());
	System.out.println("status ="+account.getStatus());
	System.out.println("currency ="+account.getaccountId());
	}

}
