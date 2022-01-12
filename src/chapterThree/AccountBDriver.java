package chapterThree;

public class AccountBDriver {
    public static void main(String[] args) {
        AccountB account = new AccountB();
        account.setAcctName("Shola Azeez");
        AccountB account1 = new AccountB();
        account1.setAcctName("Olalekan Ibidapo");

        account.getAcctName();
        System.out.print("first account name is: ");
        System.out.println(account.getAcctName());
        System.out.print("second account name is: ");
        String secondAcct = account1.getAcctName();
        System.out.println(secondAcct);

        System.out.println();

        account.setAcctNumber("0015968994");
        account1.setAcctNumber("0012355261");
        String acctNumber = account.getAcctNumber();
        String acctNumber2 = account1.getAcctNumber();
        System.out.printf("Shola Azeez's account number is: %s", acctNumber);
        System.out.println();
        System.out.printf("Olalekan Ibidapo's account number is: %s", acctNumber2);

        System.out.println();
        System.out.println();

        account.setBalance(30_000);
        account1.setBalance(22_000);
        int balance = account.getBalance();
        int balance1 = account1.getBalance();
        System.out.printf("Shola's account balance is: %d", balance);
        System.out.println();
        System.out.printf("Olalekan's account balance is: %d", balance1);

        System.out.println();

      int withdrawal =  account.makeWithdrawal(10000);
        //System.out.println("Withdrawing" + withdrawal + "from " + account.getAcctName() + "Account");
        System.out.println("The remaining balance is "  + account.getBalance() );


//        account1.withdrawal(35000);
//        int withdraw1 = account1.makeWithdrawal();
//        System.out.println(balance1-withdraw1);
    }



}
