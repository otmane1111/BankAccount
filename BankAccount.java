

public class BankAccount{
	private String accountId;
	private double balance;
	private String currency;
	private String status;
	
	
	
	public BankAccount (){
		
		status = "CREATED";
	
	}
	public  String getaccountId(){
	
		return accountId;
	}
	public void setaccountId(String accountId){
	
		this.accountId = accountId;
	}
	
	
	public  double getbalance(){
	
		return balance;
	}
	public void  setbalance(double balance){
	
		this.balance = balance;
	}
	
	
	public  String getcurrency(){
	
		return currency;
	}
	public void  setcurrency(String currency){
	
		this.currency = currency;
	}
	
	public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
