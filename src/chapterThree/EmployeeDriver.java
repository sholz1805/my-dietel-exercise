package chapterThree;
import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        double salary;

        Employee employee1 = new Employee();
        System.out.println("Enter First Name");{
            firstName = input.nextLine();
            employee1.setFirstName(firstName);


            //System.out.println(employee1.getFirstName());

//            Employee num2 = new Employee();
//            System.out.println("Enter First Name");

         System.out.println();
         System.out.println("Enter Surname");{
         lastName = input.nextLine();
         employee1.setLastName(lastName);
         String firstName1 = employee1.getFirstName();
         String lastName1 = employee1.getLastName();
         System.out.printf("Your Name is: %s %s", firstName1, lastName1);


         employee1.setSalary(400_000.00);
         salary = employee1.getSalary();{
         System.out.println();
         System.out.printf("your monthly salary is: %.2f", salary);


         double salaryRaise;
         employee1.getSalary();{
         salaryRaise =((salary/10) + salary);
         System.out.println();
         System.out.printf("Your Salary has been increased by 10%%, it is now: %.2f", salaryRaise);
                    }
                    }
                }
            }


        }

    }
