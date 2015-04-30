
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

    public Account openAccount(String tel,Customer customer,double price){
        台北富邦 b=new 台北富邦();
        return b.hiAccount(customer);
    }
        public  void showOpenAccountInfo(String language){
           
            ls.showOpenAccountInfo(language);
       // System.out.printf("showOpenAccountInfo\n");
    };
}
