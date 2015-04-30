
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
    public Transactions()
    {
      ls=new LanguageStrategy();
    }
    
    public void recordBill(){
      // System.out.printf("紀錄了一筆交易資料...\n");
    }
    public void showBill(String language){
        ls.showBill(language);
    }

    
}
