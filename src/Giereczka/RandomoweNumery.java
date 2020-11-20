package Giereczka;
import java.util.Random;

public class RandomoweNumery {

        public static int rndRange(int start, int finish)
        {
            Random rnd = new Random();//funkcja losująca
            int x = rnd.nextInt(finish + 1 - start) + start; //ustla warunki od jakiego numeru do jekiego wybiera liczbe
            return x;
        }

    }

