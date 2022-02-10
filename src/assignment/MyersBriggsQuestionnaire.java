package assignment;

import java.util.Objects;
import java.util.Scanner;

public class MyersBriggsQuestionnaire {


   public static String input(){
       Scanner scanner = new Scanner(System.in);
       return scanner.nextLine();
   }
    public static void main(String[] args) {

        String header = """
                MYERS-BRIGGS Questionnaire
                select options A or B
                Your test starts now!
                """;
        System.out.println(header);

        int countExtroversion = 0;
        int countIntroversion = 0;
        int countSensing = 0;
        int countIntuition = 0 ;
        int countThinking = 0;
        int countFeeling = 0;
        int countJudging = 0;
        int countPerceiving = 0;


        String optionNo1 = getQuestion();

        if (Objects.equals(optionNo1, "a")){
            countExtroversion++;
        }
        else
            countIntroversion++;

        String secondQuestion = """
                    2. (A)interpret literally
                       (B)look for meaning and possibilities
                    """;
        System.out.println(secondQuestion);
        String optionNo2 = input();

        if (Objects.equals(optionNo2, "a")){
            countSensing++;
        }
        else
            countIntuition++;

        String thirdQuestion = """
                    3. (A)logical, thinking, questioning
                       (B)emphatic, feeling, accommodating
                    """;
        System.out.println(thirdQuestion);
        String optionNo3 = input();

        if (Objects.equals(optionNo3, "a")){
            countThinking++;
        }
        else
            countFeeling++;

        String fourthQuestion = """
                    4. (A)organized, orderly
                       (B)flexible, adaptable
                    """;
        System.out.println(fourthQuestion);
        String optionNo4 = input();

        if (Objects.equals(optionNo4, "a")){
            countJudging++;
        }
        else
            countPerceiving++;

        String fifthQuestion = """
                    5. (A)more outgoing, think out loud
                       (B)more reserved, think to yourself
                    """;
        System.out.println(fifthQuestion);
        String optionNo5 = input();

        if (Objects.equals(optionNo5, "a")){
            countExtroversion++;
        }
        else
            countIntroversion++;

        String sixthQuestion = """
                    6. (A)practical, realistic, experiential
                       (B)imaginative, innovative, theoretical
                    """;
        System.out.println(sixthQuestion);
        String optionNo6 = input();

        if (Objects.equals(optionNo6, "a")){
            countSensing++;
        }
        else
            countIntuition++;

        String seventhQuestion = """
                    7. (A)candid, straight forward, frank
                       (B)tactful, kind, encouraging
                    """;
        System.out.println(seventhQuestion);
        String optionNo7 = input();

        if (Objects.equals(optionNo7, "a")){
            countThinking++;
        }
        else
            countFeeling++;

        String eightQuestion = """
                    8. (A)plan, schedule
                       (B)unplanned, spontaneous
                    """;
        System.out.println(eightQuestion);
        String optionNo8 = input();

        if (Objects.equals(optionNo8, "a")){
            countJudging++;
        }
        else
            countPerceiving++;

        String ninthQuestion = """
                    9. (A)seek may tasks, public activities, interaction with others
                       (B)seek private, solitary activities with quiet to concentrate
                    """;
        System.out.println(ninthQuestion);
        String optionNo9 = input();

        if (Objects.equals(optionNo9, "a")){
            countExtroversion++;
        }
        else
            countIntroversion++;

        String tenthQuestion = """
                    10. (A)standard, usual, conventional
                        (B)different, novel, unique
                    """;
        System.out.println(tenthQuestion);
        String optionNo10 = input();

        if (Objects.equals(optionNo10, "a")){
            countSensing++;
        }
        else
            countIntuition++;

        String eleventhQuestion = """
                    11. (A)firm, tend to criticize, hold the line
                        (B)gentle, tend to appreciate, conciliate
                    """;
        System.out.println(eleventhQuestion);
        String optionNo11 = input();

        if (Objects.equals(optionNo11, "a")){
            countThinking++;
        }
        else
            countFeeling++;

        String twelfthQuestion = """
                    12. (A)regulated, structured
                        (B)easy-going, "live" and "let live"
                    """;
        System.out.println(twelfthQuestion);
        String optionNo12 = input();

        if (Objects.equals(optionNo12, "a")){
            countJudging++;
        }
        else
            countPerceiving++;

        String thirteenthQuestion = """
                13. (A) external, communicative, express yourself
                    (B) internal, reticent, keep to yourself
                """;
        System.out.println(thirteenthQuestion);
        String optionNo13 = input();

        if (Objects.equals(optionNo13, "a")){
            countExtroversion++;
        }
        else
            countIntroversion++;

        String fourteenthQuestion = """
                14.  (A) focus on here-and-now
                     (B) look to the future, global perspective, "big picture"
                """;
        System.out.println(fourteenthQuestion);
        String optionNo14 = input();

        if (Objects.equals(optionNo14, "a")){
            countSensing++;
        }
        else
            countIntuition++;

        String fifteenthQuestion = """
                15.  (A) tough-minded, just
                     (B) tender-hearted, merciful
                """;
        System.out.println(fifteenthQuestion);
        String optionNo15 = input();

        if (Objects.equals(optionNo15, "a")){
            countThinking++;
        }
        else
            countFeeling++;

        String sixteenthQuestion = """
                16. (A) preparation, plan ahead
                    (B) go with the flow, adapt as you go
                """;
        System.out.println(sixteenthQuestion);
        String optionNo16 = input();

        if (Objects.equals(optionNo16, "a")){
            countJudging++;
        }
        else
            countPerceiving++;

        String seventeenthQuestion = """
                17. (A) active, initiate
                    (B) reflective, deliberate
                """;
        System.out.println(seventeenthQuestion);
        String optionNo17 = input();

        if (Objects.equals(optionNo17, "a")){
            countExtroversion++;
        }
        else
            countIntroversion++;

        String eighteenthQuestion = """
                18. (A) fact, things, "what is"
                    (B) ideas, dreams, "what could be", philosophical 
                """;
        System.out.println(eighteenthQuestion);
        String optionNo18 = input();

        if (Objects.equals(optionNo18, "a")){
            countSensing++;
        }
        else
            countIntuition++;

        String nineteenthQuestion = """
                19. (A) matter of fact, issue-oriented
                    (B) sensitive, people-oriented,  compassionate
                """;
        System.out.println(nineteenthQuestion);
        String optionNo19 = input();

        if (Objects.equals(optionNo19, "a")){
            countThinking++;
        }
        else
            countFeeling++;

        String twentiethQuestion = """
                20.   (A) control, govern
                      (B) latitude, freedom
                """;
        System.out.println(twentiethQuestion);
        String optionNo20 = input();

        if (Objects.equals(optionNo20, "a")){
            countJudging++;
        }
        else
            countPerceiving++;



        System.out.printf("Your response are: (1.)%s (2.)%s (3.)%s (4.)%s (5.)%s%n", optionNo1, optionNo2, optionNo3, optionNo4, optionNo5 );
        System.out.printf("                   (6.)%s (7.)%s (8.)%s (9.)%s (10.)%s%n ", optionNo6, optionNo7, optionNo8, optionNo9, optionNo10);
        System.out.printf("                  (11.)%s (12.)%s (13.)%s (14.)%s (15.)%s%n ", optionNo11, optionNo12, optionNo13, optionNo14, optionNo15);
        System.out.printf("                  (16.)%s (17.)%s (18.)%s (19.)%s (20.)%s%n ", optionNo16, optionNo17, optionNo18, optionNo19, optionNo20);
      System.out.println("Your Character Traits are: ");
        if (countExtroversion > countIntroversion){
            System.out.print("Extrovert - ");}
        else
            System.out.print("Introvert - ");

        if (countSensing > countIntuition){
            System.out.print("Sensing - ");}
        else
            System.out.print("Intuition - ");

        if (countThinking > countFeeling){
            System.out.print("Thinking - ");}
        else
            System.out.print("Feeling - ");

        if ( countJudging > countPerceiving){
            System.out.print("Judging");}
        else
            System.out.print("Perceiving");
        }

    private static String getQuestion() {
        String firstQuestion = """
                    1. (A)Expand energy, enjoy groups
                       (B)Conserve energy, enjoy one-on-one
                    """;
        System.out.println(firstQuestion);
        return input();
    }

}






