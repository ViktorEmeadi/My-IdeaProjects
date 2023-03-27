package tdd;

public class Account {
    int amt;
    int amtt;
    public void deposit(int amount) {
        if(amount != 0){
            amt = amount; ;
        }
        if(amount < 1) {
            amount = 0;
            amt = amount;
        }
    }

    public void withdrawCash(int amount) {
        amtt = amount;
    }
    public int getBalance() {
        if (amtt < 1) return amt;
        else if(amt >= amtt) return amt - amtt;
        else if (amtt > amt) return amt;
        else return amt - amtt;
    }
}
