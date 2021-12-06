package chapterSix;

public class MyAct {
    private String name;
    private String pin;
    private int balance = 50_000;
    public MyAct(String name, String pin) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int deposit(int depositAmount) {
        if (depositAmount > 0 )
        balance = balance + depositAmount;
        return balance;
    }

    public int getBalance(String pin ) {
        return balance;
    }

    public int withdraw(int withdrawalAmount) {
        if (withdrawalAmount > 0)
        balance = balance - withdrawalAmount;
        if (withdrawalAmount > balance){
            System.out.println("Exceeded Account Limit");
        }


        return balance;
    }
}
