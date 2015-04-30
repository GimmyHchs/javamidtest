
/**
 * Write a description of class 台灣銀行 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class 台灣銀行 extends Bank
{

    public 台灣銀行()
    {

    }
    public Account openAccount(Customer customer,double price){
        return new Account("accnum000",customer.ID,price);
    }
     public  void showOpenAccountInfo(String language,Account acc){
        ls.showOpenAccountInfo(language,acc);
    };
    public  void showOpenCustomerInfo(String language,Customer c){
        ls.showOpenCustomerInfo(language,c);
    }
}
