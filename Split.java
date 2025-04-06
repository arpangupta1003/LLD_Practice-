public class Split {
    User user;
    int amount;
    Split(User user,int amount){
        this.user=user;
        this.amount=amount;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
