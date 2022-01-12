package chapterFour;

public class StudentTest {
    public static void main(String[] args) {

    Student student = new Student("Shola", 85.5);
    Student student2 = new Student("Bosun", 67.9);
    Student student3 = new Student("Alo", 48.3);

    String name = student.getName();
    String grade = student.getLetterGrade();

        System.out.printf("%s's grade is %s%n", name , grade);


    String name2 = student2.getName();
    String grade2 = student2.getLetterGrade();
        System.out.printf("%s's grade is %s%n", name2, grade2);

    String name3 = student3.getName();
    String grade3 = student3.getLetterGrade();
        System.out.printf("%s's grade is %s%n", name3, grade3);
    }
}

