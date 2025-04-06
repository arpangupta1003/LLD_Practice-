import java.util.*;

public class BalanceSheetController {
    public BalanceSheet balanceSheet;

    public BalanceSheetController(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }
    public void updateUserExpenseBalanceSheet(User payUser, List<Split> splitDetails, int amount){
        balanceSheet.addBalance(payUser, splitDetails);
    }
    public void showBalanceSheet(User user){
        balanceSheet.showBalance(user);
    }
}
