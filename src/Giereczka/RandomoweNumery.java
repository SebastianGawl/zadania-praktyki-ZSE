package Giereczka;
import java.util.Random;

public class RandomoweNumery {

        public static int rndRange(int start, int finish) //funkcja losująca
        {
            Random rnd = new Random();
            int x = rnd.nextInt(finish + 1 - start) + start;
            return x;
        }

    }

