package se.lexicon;

public class bankAccount {
    private String id;
    private int balance;
    private customer a;

    /*   public bankAccount(String id, int balance, customer a) {
           this.id = id;
           this.balance = balance;
           this.a = a;
       }
   */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public customer getA() {
        return a;
    }

    public void setA(customer a) {
        this.a = a;
    }
    public boolean deposit(int depAmount){
        if (depAmount<=0) {
            this.balance =+ depAmount;
            return true;
        }
        return false;
    }
    public boolean withdraw(int withAmount){
        if (withAmount>this.balance){
            return false;
        }
        if (withAmount<=0){
            return false;
        }
        if (withAmount<this.balance){
            this.balance=-withAmount;
        }
        return true;
    }
}
