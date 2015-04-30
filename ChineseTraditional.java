
/**
 * Write a description of class ChineseTraditional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChineseTraditional extends Language
{

    public ChineseTraditional()
    {

    }
    public void showBill(){
        System.out.printf("顯示一個繁體中文的Bill\n");
    }
    public void showOpenCustomerInfo(Customer c){
        System.out.printf("<--------Customer Information-------->\n");
        System.out.printf("姓名 = "+c.name+"\n");
        System.out.printf("客戶ID = "+c.ID+"\n");
        System.out.printf("地址 = "+c.address+"\n");
        System.out.printf("電話 = "+c.tel+"\n");
        System.out.printf("傳真 = "+c.fax+"\n");
       System.out.printf("<--------Customer Information-------->\n");
    };
    public void showOpenAccountInfo(Account acc){
        System.out.printf("<--------Account Information-------->\n");
        System.out.printf("帳戶ID = "+acc.accnum+"\n");
        System.out.printf("所有人ID = "+acc.customer_ID+"\n");
        System.out.printf("帳戶餘額 = "+acc.balance+"\n");
       System.out.printf("<--------Account Information-------->\n");
    };
    public void showChangeLanguageInfo(){
        System.out.printf("現在使用的語言是繁體中文!!!\n");
    }  
    public void showDepositError(){
        System.out.printf("在存款時出錯了...是不是您沒有建立銀行帳戶?\n");
    }
    public void showGetBalance(double price){
        System.out.printf("您的帳戶餘額 = "+price+"\n");
    }
    public void showGetBalanceError(){
        System.out.printf("在查詢餘額時出錯了...是不是您沒有建立銀行帳戶?\n");
    }
}
