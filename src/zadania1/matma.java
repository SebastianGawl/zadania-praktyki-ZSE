package zadania1;

import java.util.Scanner;

public class matma {

        static double PI = 3.14;
        static double E = 2.71;

    static int metoda1(int a){
        int a3 = a*a*a;
        return a3;
  }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);{
            System.out.println("Podaj liczbę a=");
            int a = scanner.nextInt();
            System.out.println("Podaj liczbę b=");
            int b = scanner.nextInt();
            System.out.println("Podaj liczbę c=");
            int c = scanner.nextInt();

            System.out.println("\nMetoda 1" + "\n" + a + " do potęgi 3 jest " + metoda1(a));

            int suma = a+b;
            int roznica = a-b;
            int iloczyn = a*b;

            System.out.println("\nMetoda 2 " + "\n" + a + " + " + b + " = " + suma);
            System.out.println(a + " - " + b + " = " + roznica);
            System.out.println(a + " x " + b + " = " + iloczyn);

            int ab = (a*a) + (b*b);
            int cc = c*c;

            if (ab == cc){
                System.out.println("\nMetoda 3 \n = (Trójkąt = true)");
            }
            else {
                System.out.println("\nMetoda 3 \n = (Trójkąt = false)");
            }
            }

        }

}
