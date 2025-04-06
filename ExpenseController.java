import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    ExpenseController(){
        balanceSheetController=new BalanceSheetController();
    }
    public Expense createExpense(String expenseId, int amount, User payingUser, List<Split> splitDetails){
        Expense expense=new Expense(expenseId, amount, payingUser, splitDetails);
        System.out.println("Expense is "+expense.amount);
        balanceSheetController.updateUserExpenseBalanceSheet(payingUser, splitDetails, amount);
        return expense;
    }
}
