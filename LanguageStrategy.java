
/**
 * Write a description of class LanguageStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LanguageStrategy
{
    // instance variables - replace the example below with your own
    private int x;
    Language l;
    /**
     * Constructor for objects of class LanguageStrategy
     */
    public LanguageStrategy()
    {

    }
    public void chooseLanguage(String language){
        if(language.equals("English"))
           l=new English();
        else if(language.equals("ChineseSimplified"))
           l=new ChineseSimplified();
        else if(language.equals("ChineseTraditional"))
           l=new ChineseTraditional();
    }
    public void showBill(Transactions ts,String language){
        this.chooseLanguage(language);
        l.showBill(ts);
    }
    public void showOpenCustomerInfo(String language,Customer customer){
        this.chooseLanguage(language);
        l.showOpenCustomerInfo(customer);
    }
     public void showOpenAccountInfo(String language,Account acc){
        this.chooseLanguage(language);
        l.showOpenAccountInfo(acc);
    }
    public void showChangeLanguageInfo(){
        l.showChangeLanguageInfo();
    }
    public void showDepositError(){
        l.showDepositError();
    }
    public void showGetBalance(double price){
        l.showGetBalance(price);
    }
    public void showGetBalanceError(){
        l.showGetBalanceError();
    }
    public void showWithdrawError(){
        l.showWithDrawError();
    }
    public void showTransferError(){
        l.showTransferError();
    }
}
