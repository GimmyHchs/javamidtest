
/**
 * Write a description of class BankController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankController
{
    private String bankname;
    private String bankID;
    private String bankSWIFT;
    
    public BankController(String bankname,String bankID,String bankSWIFT)
    {
      this.bankname=bankname;
      this.bankID=bankID;
      this.bankSWIFT=bankSWIFT;
    }

    public Bank bankFactory()
    {
       if(bankname.equals("台灣銀行"))
          return new 台灣銀行();
       else if(bankname.equals("中國信託"))
          return new 中國信託();
       else
           return new 台北富邦Adapter();
    }
}
