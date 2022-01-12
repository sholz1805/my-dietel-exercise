package chapterThree;

public class AccountB {
    private String acctName;
    private String acctNumber;
    private int balance;

    int withdrawal;
    int deposit;

    public void setAcctName(String acctName) {
        this.acctName = acctName;

//  public void setAcctName(String name){
//       acctName = name;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public void setBalance(int amount) {
        balance = amount;
    }

    public int getBalance() {
        return balance;
    }



    public int makeWithdrawal(int withdrawalAmount) {
        if (withdrawalAmount > balance){
            System.out.println("Withdrawal Amount Exceeded");
            //withdrawalAmount = 0;
            this.balance = balance;
            return balance;
        }
                balance = balance - withdrawalAmount;
                return balance;

        }

    }
