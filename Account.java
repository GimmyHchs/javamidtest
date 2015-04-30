
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
    private TransferStrategy tss;
    private int s_count=0;
    public Account(String bankname,String accnum,String customer_ID,double balance){
     this.bankname=bankname;
     this.accnum=accnum;
     this.customer_ID=customer_ID;
     this.balance=balance;
     tss=new TransferStrategy(bankname);
    }
    public void setAccnum(String s)
    {
        this.accnum=s;
    }
  public boolean withdraw(double price,String language){
     this.balance -= price;
     ts=new Transactions("T000"+s_count++,"withdraw",price,balance,0);
     ls.showBill(ts,language);
    return true;
   }
  public boolean deposit(double price,String language){
     this.balance += price;
     ts=new Transactions("T000"+s_count++,"deposit",price,balance,0);
     ls.showBill(ts,language);
     return true;
  }
    public boolean transferIn(double price){

         this.balance -= tss.transferIn();
         this.balance += price;
         ts=new Transactions("T000"+s_count++,"trasferIn",price,balance,tss.transferIn());
         ls.showBill(ts,language);
         return true;
   }
     public boolean transferOut(double price){
         this.balance -= price;
         this.balance -= tss.transferOut();
         ts=new Transactions("T000"+s_count++,"trasferOut",price,balance,tss.transferOut());
         ls.showBill(ts,language);
         return true;
   }
   public double getBalance(){
       return this.balance;
    }
   
}
