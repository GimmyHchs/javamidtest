
/**
 * Write a description of class ChineseSimplified here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChineseSimplified extends Language
{

    public ChineseSimplified()
    {

    }
    public void showBill(){
        System.out.printf("顯示一個檢體中文的Bill\n");
    }
        public void showOpenCustomerInfo(Customer c){
   
        System.out.printf("<--------Customer Information-------->\n");
        System.out.printf("姓名 = "+c.name+"\n");
        System.out.printf("客戶ID = "+c.ID+"\n");
        System.out.printf("地址 = "+c.address+"\n");
        System.out.printf("电话 = "+c.tel+"\n");
        System.out.printf("传真 = "+c.fax+"\n");
  
       System.out.printf("<--------Customer Information-------->\n");
   
    };
    public void showOpenAccountInfo(Account acc){
        System.out.printf("<--------Account Information-------->\n");
        System.out.printf("帐户ID = "+acc.accnum+"\n");
        System.out.printf("所有人ID = "+acc.customer_ID+"\n");
        System.out.printf("帐户余额 = "+acc.balance+"\n");
        System.out.printf("<--------Account Information-------->\n");
    };
    public void showChangeLanguageInfo(){
        System.out.printf("现在使用的语言是简体中文!!!\n");
    }     
    public void showDepositError(){
        System.out.printf("在存款时出错了...是不是您没有建立银行帐户??\n");
    }
        public void showGetBalance(double price){
        System.out.printf("您的帐户余额 = "+price+"\n");
    }
    public void showGetBalanceError(){
        System.out.printf("在查询余额时出错了...是不是您没有建立银行帐户?\n");
    }
}
