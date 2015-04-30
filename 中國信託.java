
/**
 * Write a description of class 中國信託 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class 中國信託 extends Bank
{
   
    
    public 中國信託()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Account openAccount(Customer customer,double price){
        return new Account("中國信託","accnum001",customer.ID,price);
    }
    public  void showOpenAccountInfo(String language,Account acc){
         ls.showOpenAccountInfo(language,acc);
    }
    public  void showOpenCustomerInfo(String language,Customer c){
        ls.showOpenCustomerInfo(language,c);
    }
   
}
