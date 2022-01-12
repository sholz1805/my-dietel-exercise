package chapterTwo;

import java.util.Scanner;
//prompt user to enter number of students in the group
//prompt user for size of teams to be formed
//display how many teams that can be formed
//display how many students left without a team
public class TeamSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents;
        int sizeOfTeams;

        System.out.println("Enter number of Students");
        numberOfStudents = scanner.nextInt();
        System.out.println("Enter size of Teams");
        sizeOfTeams= scanner.nextInt();

        int teamsFormed = numberOfStudents/sizeOfTeams;
        int studentsLeft = numberOfStudents%sizeOfTeams;
        System.out.printf("Number of teams that can be formed is: %d%n",teamsFormed);
        System.out.printf("Number of students left is: %d",studentsLeft);
    }
}
