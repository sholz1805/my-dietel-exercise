package assignment;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class ChristmasQuestions {
    public static void main(String[] args) {
        ArrayList<String> answer = new ArrayList<>();
//        SecureRandom secureRandom = new SecureRandom();
        Scanner input = new Scanner(System.in);

//1. Have a list of 20 Christmas questions
//2. Display 5 random questions from the 20 questions
//3. Save user response for each question displayed in another array
//4. Mark questions
//5. Display result and comment on result
        String Xmas = """
                1. Question: When is Christmas celebrated?
                2. Question: The traditional Christmas tree originated from which country?
                3. Question: People buy Artificial Christmas trees more than real ones. True or false?
                """;
                int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("When is Christmas Celebrated ?");
                String options = """
                        a.) December 25
                        b.) December 22
                        c.) January 2
                        """;
                System.out.println();
                System.out.println(options);
                String user = input.next();
                String userChoice = input.nextLine();
                switch (userChoice) {
                    case "a":
                        System.out.println("December 25");
                        break;
                    case "b":
                        System.out.println("December 22");
                        break;
                    case "c":
                        System.out.println("January 2");
                        break;
                }
            }
//                if (userChoice == "a"){
//                    answer.add(userChoice);
//                    System.out.println("Correct Answer");
//                }

        }

    }
}