import java.util.*;

public class BalanceSheetController {
    BalanceSheet balanceSheet;
    public void updateUserExpenseBalanceSheet(User payUser, List<Split> splitDetails, int amount){
        System.out.println("updateUserExpenseBalanceSheet called");
        balanceSheet=new BalanceSheet();
        balanceSheet.addBalance(payUser, splitDetails);
        showBalanceSheet(payUser);
    }
    public void showBalanceSheet(User user){
        balanceSheet.showBalance(user);
    }
}
