public class App {
    public static void main(String[] args) {
        BankAccount [] accounts = new BankAccount[4];
        accounts [0] = new BankAccount("USD",4500);
        accounts [1] = new BankAccount("MAD",1299);
        accounts [2] = new BankAccount("USD",1200);
        accounts [3] = new BankAccount("MAD",1000);
        for (int i = 0 ; i < accounts.length; i++){
            System.out.println(accounts[i].toString());

            }
        for (BankAccount acc:accounts){

            System.out.println("balance ="+acc.getbalance());
            
        }


    }
    
}
