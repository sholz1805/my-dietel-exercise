package assignment;

public class ArrayPractice {
    public static void main(String[] args) {

        String[][] names = new String[3][3];
        int i;
        int j;

        names[0]= new String[]{"Shao_Khan", "Sub_Zero", "Sonya" };
        names[1]= new String[]{"Kano", "Jax", "Scorpion"};
        names[2]= new String[]{"Liu_Kang", "Kung_Lao", "Millena"};

        for (i = 0; i < names.length; i++) {
                    System.out.println( );
                    for (j = 0; j < names[i].length; j++){
                    System.out.print(names[i][j]+ "  ");
                }

        }
    }
}
