import java.util.*;

public class Main {
    static UserController userController = new UserController();
    static BalanceSheet balanceSheet = new BalanceSheet(userController);
    static BalanceSheetController balanceSheetController = new BalanceSheetController(balanceSheet);
    static ExpenseController expenseController = new ExpenseController(balanceSheetController);

    public static void main(String args[]) {
        generateUsers();
        List<Split> splitDetails = generateSplit();
        List<Split> splitDetails1 = generateSplit1();
        generateExpense(splitDetails);
        generateExpense1(splitDetails1);
        showBalance();

    }

    public static void showBalance() {
        balanceSheetController.showBalanceSheet(userController.getUser("001")); // for Arpan
        balanceSheetController.showBalanceSheet(userController.getUser("002")); // for Arpan
        balanceSheetController.showBalanceSheet(userController.getUser("003")); // for Arpan


        // balanceSheetController.showBalanceSheet(userController.getUser("001")); //
        // for Arpan
    }

    public static void generateUsers() {
        User user1 = new User("Arpan", "001");
        User user2 = new User("Prateek", "002");
        User user3 = new User("Anurag", "003");
        User user4 = new User("Suryansh", "004");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
        userController.addUser(user4);
        List<User> userList = userController.getAllUsers();
        for (User user : userList) {
            System.out.println(user.getName());
        }
    }

    public static List<Split> generateSplit() {
        Split split1 = new Split(userController.getUser("001"), 200);
        Split split2 = new Split(userController.getUser("002"), 200);
        Split split3 = new Split(userController.getUser("003"), 200);
        Split split4 = new Split(userController.getUser("004"), 200);
        List<Split> splitDetails = new ArrayList<>();
        splitDetails.add(split1);
        splitDetails.add(split2);
        splitDetails.add(split3);
        splitDetails.add(split4);
        return splitDetails;
    }

    public static List<Split> generateSplit1() {
        Split split1 = new Split(userController.getUser("001"), 300);
        Split split2 = new Split(userController.getUser("002"), 300);
        Split split3 = new Split(userController.getUser("003"), 300);
        Split split4 = new Split(userController.getUser("004"), 300);
        List<Split> splitDetails = new ArrayList<>();
        splitDetails.add(split1);
        splitDetails.add(split2);
        splitDetails.add(split3);
        splitDetails.add(split4);
        return splitDetails;
    }

    public static void generateExpense(List<Split> splitDetails) {
        expenseController.createExpense("exp01", 800, userController.getUser("001"), splitDetails);
    }
    public static void generateExpense1(List<Split> splitDetails) {
        expenseController.createExpense("exp02", 1200, userController.getUser("002"), splitDetails);
    }
}
