package chapterFourteen;

public class NumberOfTimeAStringCanBeFormed {

        static int count(String a, String b, int m, int n)
        {

            if (n == 0)
                return 1;

            if (m == 0)
                return 0;

            if (a.charAt(m - 1) == b.charAt(n - 1))
                return count(a, b, m - 1, n - 1) +
                        count(a, b, m - 1, n);
            else
                return count(a, b, m - 1, n);
        }


        public static void main (String[] args)
        {
            String a = "balloonballoon";
            String b = "balloon";
            System.out.println( count(a, b, a.length(), b.length())) ;

        }
    }



