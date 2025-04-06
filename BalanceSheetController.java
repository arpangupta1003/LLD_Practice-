import java.util.*;

public class BalanceSheetController {
    BalanceSheet balanceSheet=new BalanceSheet();
    public void updateUserExpenseBalanceSheet(User payUser, List<Split> splitDetails, int amount){
        System.out.println("updateUserExpenseBalanceSheet called");
        balanceSheet=new BalanceSheet();
        balanceSheet.addBalance(payUser, splitDetails);
    }
    public void showBalanceSheet(User user){
        balanceSheet.showBalance(user);
    }
}
