
/**
 * Write a description of class TEST here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TEST
{
   // public static String language="ChineseTraditional";
    //public static String language="ChineseSimplified";
    public static String language="English";
    public static String target_bankname="台灣銀行";  //中國信託 、 台北富邦
    BankController bc;
    Bank bank1;
    Customer cust;
    LanguageStrategy ls;
    Account acc;
    int acoount_count=0;
  
    public TEST(){
       bc=new BankController(target_bankname,"004","BKTWTWTP042");
       bank1 = bc.bankFactory();
       ls=new LanguageStrategy();
       ls.chooseLanguage(language);
       cust = new Customer("Mr. A", "E0000001","Taipei","123456789", "0333333333" );
    }
   public void openAccount(){
     acc = bank1.openAccount(cust, 100);
     acc.setAccnum("IDacc000"+acoount_count++);
     bank1.showOpenCustomerInfo(language,cust);
     System.out.print("                ↑               \n");
     System.out.print("                ↓               \n");
     bank1.showOpenAccountInfo(language,acc);

   }
   public void chooseLanguage(String l){
     if(l.equals("English")||l.equals("ChineseTraditional")||l.equals("ChineseSimplified"))
     {
       this.language=l;
       ls=new LanguageStrategy();
       ls.chooseLanguage(language);
       ls.showChangeLanguageInfo();
      }
      else
        System.out.print("Sorry.... We just support [English] [ChineseTraditional] [ChineseSimplified]"+"\n"+"Use the Default Language = \"English\"");
     
   }
   public void withdraw(double price){
       if(acc==null||acc.balance-price<0)
       {
         ls.showWithdrawError();
       }
       else
       acc.withdraw(price,language);
    }
   public void deposit(double price){
       if(acc==null)
       {
         ls.showDepositError();
       }
       else
       acc.deposit(price,language);
    }
   public void showBalance(){
      if(acc==null)
       {
         ls.showGetBalanceError();
       }
       else
      {
         ls.showGetBalance(acc.getBalance());
      }
    
    }
    public void transferOut(double price){
       if(acc==null||acc.balance-price<0)
       {
         ls.showTransferError();
       }
       else
        acc.transferOut(price);
    }
    public void transferIn(double price){
        if(acc==null)
       {
         ls.showTransferError();
       }
       else
        acc.transferIn(price);
    }
}
