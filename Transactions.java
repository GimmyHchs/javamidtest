
/**
 * Write a description of class Transactions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transactions
{
    //public String language;
    public LanguageStrategy ls;
    public String ts_num;
    public String ts_type;
    public double ts_price;
    public double ts_balance;
    public double ts_transfer;
    public Transactions(String n,String t,double p,double b,double tt)
    {
      ls=new LanguageStrategy();
      this.ts_num=n;
      this.ts_type=t;
      this.ts_price=p;
      this.ts_balance=b;
      this.ts_transfer=tt;
    }
    
    
    public void recordBill(){
      // System.out.printf("紀錄了一筆交易資料...\n");
    }
    

    
}
