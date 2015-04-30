
/**
 * Write a description of class Adapter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class 台北富邦Adapter extends Bank
{

    public 台北富邦Adapter()
    {
 
    }

    public Account openAccount(Customer customer,double price){
        台北富邦 b=new 台北富邦();
        return b.hiAccount(customer,price);
    }
    public  void showOpenAccountInfo(String language,Account acc){
        ls.showOpenAccountInfo(language,acc);
    };
     public  void showOpenCustomerInfo(String language,Customer c){
        ls.showOpenCustomerInfo(language,c);
    }
}
