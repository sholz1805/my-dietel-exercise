package chapterFour;

import java.util.Scanner;

public class ResultChecker {
    /*
        A college offers a course that prepares students for the state licensing exam for real-estate
        brokers. Last year, ten of the students who completed this course took the exam. The college
        wants to know how well its students did on the exam. You’ve been asked to write a
        program to summarize the results. You’ve been given a list of these 10 students. Next to
        each name is written a 1 if the student passed the exam or a 2 if the student failed.
        Your program should analyze the results of the exam as follows:
                1. Input each test result (i.e., a 1 or a 2). Display the message “Enter result” on the screen
                each time the program requests another test result
                2. Count the number of test results of each type.
                3. Display a summary of the test results, indicating the number of students who passed and
                the number who failed.
                4. If more than eight students passed the exam, print “Bonus to instructor!”

                (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any input,
if the value entered is other than 1 or 2, keep looping until the user enters a correct value.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passes = 0;
        int fails = 0;
        int studentCount = 0;

        while (studentCount < 10) {
            System.out.println("Enter result here : (1 for pass) or (2 for fail)");
            int result = scanner.nextInt();

            if (result == 1){
                passes = passes + 1;
            }
            else if (result == 2) {
                fails = fails + 1;
            }
            else {
                if (scanner.hasNextInt()){
               scanner.nextInt();
                }
            }
            studentCount++;
        }
        System.out.printf("Total number of passes : %d%n", passes);
        System.out.printf("Total number of fails: %d%n", fails);
        if (passes >= 8){
            System.out.println("Bonus to instructor!");
        }
    }
}