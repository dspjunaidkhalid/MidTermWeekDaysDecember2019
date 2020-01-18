package problemandsolutions;
import java.util.*;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }

    public static void main(String a[]){
        System.out.println("Random value between 1 and 8 : "
                + getRandomInteger(8, 1));
    }

}
