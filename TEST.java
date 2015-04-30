
/**
 * Write a description of class TEST here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TEST
{
    public static String language="English";
   public void main(){
       BankController bc=new BankController("台灣銀行","004","BKTWTWTP042");
       Bank bank1 = bc.bankFactory();
       Customer cust = new Customer("Mr. A", "E0000001","Taipei","123456789", "Ms. B" );
       Account acc = bank1.openAccount("042123456789", cust, 100);
       bank1.showOpenAccountInfo(language);
       acc.deposit(1250,language);

       
   }
}
