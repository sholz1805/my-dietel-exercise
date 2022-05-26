package chapterSeventeen;

import java.io.InputStream;
import java.security.SecureRandom;
import java.util.stream.IntStream;

public class GetRandom {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        System.out.println(secureRandom.ints(100, 1, 25)
                                       .sum());

        //System.out.println(IntStream.range(1,10).sum());
    }
}
