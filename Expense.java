


import java.util.*;

public class Expense {
    String expenseId;
    int amount;
    User payingUser;
    List<Split> splitDetails = new ArrayList<>();
     
    
    Expense(String expenseId, int amount, User payingUser, List<Split> splitDetails1){
        this.expenseId=expenseId;
        this.amount=amount;
        this.payingUser=payingUser;
        this.splitDetails=splitDetails;

    }
    
}
