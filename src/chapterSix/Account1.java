package chapterSix;

public class Account1 {
    private String accountName;
    private int balance;

    public Account1(String accountName){
        this.accountName = accountName;
    }
    public String getAccountName(){
        return accountName;
    }
    public void setAccountName(String newName){
        accountName = newName;
    }
     public void deposit(int amount){
        balance = balance + amount;
     }
     public void withdraw(int amount) {balance = balance-amount;}
    public int checkBalance(){ return balance;}

}