package classExercise;

import java.util.ArrayList;

public class ArrayListIteration {
        public static void main ( String[] args)
        {
            ArrayList<String> names = new ArrayList<>();

            names.add( "Shola" );
            names.add( "Excellence" );
            names.add( "Miju" );
            names.add( "Increase" );
            names.add( "Lekan" );

            for ( String name : names )
                System.out.println(name + " cohort 9");
        }
}
