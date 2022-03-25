package chapterFive;

public class ProductOdOddIntegers {
//    5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product
//    of the odd integers from 1 to 15.
public static void main(String[] args) {
    int product = 1;
    for (int i = 1; i <= 15; i++) {
        if (i % 2 != 0){
            product *= i;
        }

    }
    System.out.println(product);

}
}
