
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    public String accnum;
    public String customer_ID;
    public static String language="English";
    //public String Date date;
    public String cointype;
    public double balance;
    public String bankname;
    private LanguageStrategy ls=new LanguageStrategy();
    private  Transactions ts;
    public Account(String bankname,String accnum,String customer_ID,double balance){
     this.bankname=bankname;
     this.accnum=accnum;
     this.customer_ID=customer_ID;
     this.balance=balance;
    }
  public boolean withdraw(double price,String language){
     this.balance -= price;
     ts=new Transactions("T001","withdraw",price,balance);
     ls.showBill(ts,language);
    return true;
   }
  public boolean deposit(double price,String language){
     this.balance += price;
     ts=new Transactions("T001","deposit",price,balance);
     ls.showBill(ts,language);
     return true;
  }
     public boolean trasferIn(){

       return true;
   }
     public boolean trasferOut(){
         return true;
   }
   public double getBalance(){
       return this.balance;
    }
   
}
