package chapterOne;

import java.util.Scanner;

public class ComputerPurchase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//       The basic system costs 375.99.
//       The user then has to choose from a 38 cm screen (costing 75.99) or a
//       43 cm screen (costing 99.99).
//       The following extras are optional.
//       Antivirus software - 65.99
//        Printer  - 125.00
//       allow the user to select from these extras and then display the final cost of the order.

        System.out.println("We have systems with 2 different Screen sizes");
        System.out.println();
        String screen = """
                Select 1 for System with 38cm Screen (#375.99) + (#75.99)
                Select 2 for System with 43cm Screen (#375.99) + (#99.99)
                """;
        System.out.println(screen);
        System.out.println("Choose your preference");
        int userInput = scan.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("System with 38cm Screen");
                System.out.println("Amount is: #" + (375.99 + 75.99));
                System.out.println();
                System.out.println("Consider adding the following to your purchase; ");
                String extra = """
                        select 1 for Antivirus software(an additional value of #65.99)
                        select 2 for a Printer(an additional value of #125)
                        select 3 to add both 1 and 2(an additional value of #190.99)
                        """;
                System.out.println(extra);
                int option = scan.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("System with 38cm Screen + Antivirus software");
                        System.out.println("TOTAL AMOUNT = #" + (375.99 + 75.99 + 65.99));
                        break;
                    case 2:
                        System.out.println("System with 38cm Screen + printer");
                        System.out.println("TOTAL AMOUNT = #" + (375.99 + 75.99 + 125));
                        break;
                    case 3:
                        System.out.println("System with 38cm Screen + Antivirus software + printer");
                        System.out.println("TOTAL AMOUNT = #" + (375.99 + 75.99 + 65.99 + 125));
                        break;
                    default:
                        System.out.println("you've selected a wrong option");
                }
                break;

            case 2:
                System.out.println("System with 43cm Screen");
                System.out.println("Amount is: #" + (375.99 + 99.99));
                System.out.println();
                System.out.println("Consider adding the following to your purchase; ");
                String extra1 = """
                        select 1 for Antivirus software(an additional value of #65.99)
                        select 2 for a Printer(an additional value of #125)
                        select 3 to add both 1 and 2(an additional value of #190.99)
                        """;
                System.out.println(extra1);
                int option1 = scan.nextInt();
                switch (option1) {
                    case 1:
                        System.out.println("System with 43cm Screen + Antivirus software");
                        System.out.println("TOTAL AMOUNT = #" + (375.99 + 99.99 + 65.99));
                        break;
                    case 2:
                        System.out.println("System with 43cm Screen + printer");
                        System.out.println("TOTAL AMOUNT = #" + (375.99 + 99.99 + 125));
                        break;
                    case 3:
                        System.out.println("System with 43cm Screen + Antivirus software + printer");
                        System.out.println("TOTAL AMOUNT = #" + (375.99 + 99.99 + 65.99 + 125));
                        break;
                    default:
                        System.out.println("you've selected a wrong option");
                }
                break;
        }
    }
}