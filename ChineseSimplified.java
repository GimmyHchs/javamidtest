
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
    public void showBill(Transactions ts){
        
       System.out.printf("<--------订单资讯-------->\n");
       
        System.out.printf("订单编号= "+ts.ts_num+"\n");
        System.out.printf("订单类型= "+ts.ts_type+"\n");
        System.out.printf("交易价格= "+ts.ts_price+"\n");
        System.out.printf("手续费= "+ts.ts_transfer+"\n");
        System.out.printf("帐户余额= "+ts.ts_balance+"\n");
       System.out.printf("<--------订单资讯-------->\n");
    }
    public void showOpenCustomerInfo(Customer c){
        System.out.printf("<--------客户资讯-------->\n");
        System.out.printf("姓名 = "+c.name+"\n");
        System.out.printf("客户ID = "+c.ID+"\n");
        System.out.printf("地址 = "+c.address+"\n");
        System.out.printf("电话 = "+c.tel+"\n");
        System.out.printf("传真 = "+c.fax+"\n");
       System.out.printf("<--------客户资讯-------->\n");
    };
    public void showOpenAccountInfo(Account acc){
        System.out.printf("<--------帐户资讯-------->\n");
        System.out.printf("银行名称= "+acc.bankname+"\n");
        System.out.printf("帐户ID = "+acc.accnum+"\n");
        System.out.printf("所有人ID = "+acc.customer_ID+"\n");
        System.out.printf("帐户余额= "+acc.balance+"\n");
       System.out.printf("<--------帐户资讯-------->\n");
    };
    public void showChangeLanguageInfo(){
        System.out.printf("现在使用的语言是简体中文!!!\n");
    }     
    public void showDepositError(){
        System.out.printf("在存款时出错了...是不是您没有建立银行帐户??\n");
    }
    public void showWithDrawError(){
            System.out.printf("在提款时出错了...可能是余额不足或是您没有建立银行帐户...\n");
        }
    public void showGetBalance(double price){
            System.out.printf("您的帐户余额 = "+price+"\n");
        }
    public void showGetBalanceError(){
        System.out.printf("在查询余额时出错了...是不是您没有建立银行帐户?\n");
    }
    public void showTransferError(){
        System.out.printf("在转帐时出错了...可能是余额不足或是您没有建立银行帐户...\n");
}
}
