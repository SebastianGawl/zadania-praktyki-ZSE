import java.util.Scanner;

public class ObliczanieDelty {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Program obliczający delte");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj a=");
        int a = scanner.nextInt();

        System.out.print("Podaj b=");
        int b = scanner.nextInt();

        System.out.print("Podaj c=");
        int c = scanner.nextInt();

        int delta = b * b - 4 * a * c;

        System.out.println(" ");
        System.out.println("Delta wynosi: " + delta);
        if (delta < 0)

        {
            System.out.println("Brak rozwiązania delta jest mniejsza od zera");
        }
        else
        if (delta == 0)
        {
           int x = -b / (2 * a); System.out.printf("Mamy jedno rozwiązanie które wynosi: x = %f", x);

        } else
          if (delta > 0)
            {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Równania delty to: x1 = %f oraz x2 = %f", x1, x2);
        }

        }
    }

