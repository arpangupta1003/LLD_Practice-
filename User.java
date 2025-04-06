
class User{
    String name;
    String userId;
    BalanceSheetController balanceSheetController;
    User(String name, String userId){
        this.name=name;
        this.userId=userId;
        balanceSheetController= new BalanceSheetController();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
}