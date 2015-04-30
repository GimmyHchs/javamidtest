
/**
 * Write a description of class TransferStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransferStrategy
{
    Transfer t;
    /**
     * Constructor for objects of class TransferStrategy
     */
    public TransferStrategy(String bankname)
    {
        if(bankname.equals("台灣銀行"))
            t= new 台灣銀行匯率();
        else if(bankname.equals("中國信託"))
             t= new 中國信託匯率();
        else if(bankname.equals("台北富邦"))
            t= new 台北富邦匯率();
    }
    public void chooseTransfer(String bankname){
        if(bankname.equals("台灣銀行"))
            t= new 台灣銀行匯率();
        else if(bankname.equals("中國信託"))
             t= new 中國信託匯率();
        else if(bankname.equals("台北富邦"))
            t= new 台北富邦匯率();
    }
    public double transferIn(){
        return t.transferIn();
    }
    public double transferOut(){
        return t.transferOut();
    }
}
