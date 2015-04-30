
/**
 * Abstract class Bank - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Bank
{
    // instance variables - replace the example below with your own
    private int x;
    protected LanguageStrategy  ls=new LanguageStrategy();
    protected String bankname;
    protected String bankID;
    protected String bankSWIFT;
    protected String bankcountry;
    protected String bankswitchnum;
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public abstract Account openAccount(String tel,Customer customer,double price);
    public abstract void showOpenAccountInfo(String language);
    
}
