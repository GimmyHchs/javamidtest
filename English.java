
/**
 * Write a description of class English here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class English extends Language
{

    public English()
    {
       
    }
    public void showBill(){
        System.out.printf("顯示一個English的Bill\n");
    }
    public void showOpenCustomerInfo(Customer c){
        System.out.printf("<--------Customer Information-------->\n");
        System.out.printf("Name = "+c.name+"\n");
        System.out.printf("ID = "+c.ID+"\n");
        System.out.printf("Address = "+c.address+"\n");
        System.out.printf("Tel = "+c.tel+"\n");
        System.out.printf("Fax = "+c.fax+"\n");
       System.out.printf("<--------Customer Information-------->\n");
    };
    public void showOpenAccountInfo(Account acc){
        System.out.printf("<--------Account Information-------->\n");
        System.out.printf("Account ID = "+acc.accnum+"\n");
        System.out.printf("Customer ID = "+acc.customer_ID+"\n");
        System.out.printf("Blance = "+acc.balance+"\n");
       System.out.printf("<--------Account Information-------->\n");
    };
    public void showChangeLanguageInfo(){
        System.out.printf("We are Using in English!!!\n");
    }
    public void showDepositError(){
        System.out.printf("Error... You must open Account before you deposit....\n");
    }
    public void showGetBalance(double price){
        System.out.printf("Your Account Balance = "+price+"\n");
    }
    public void showGetBalanceError(){
        System.out.printf("Error... You must open Account before you get balance....\n");
    }
}
