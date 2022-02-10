package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N" + "\t" + "10 * N" + "\t" + "100 * N" + "\t" + "1000 * N");
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i + "\t\t" + i*10 + "\t\t" + i *100 + "\t\t" + i*1000);

        }
    }
}
