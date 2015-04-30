
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
    public void showBill(String language){
        this.chooseLanguage(language);
        l.showBill();
    }
    public void showOpenAccountInfo(String language){
        this.chooseLanguage(language);
        l.showOpenAccountInfo();
    }
}
