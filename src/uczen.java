package zadania1;

import java.util.Scanner;
public class uczen {

    String imie;
    String nazwisko;
    int wiek;

}
class info
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        uczen uczen = new uczen();

        System.out.println("Podaj imię:");
        uczen.imie = scan.nextLine();

        System.out.println("Podaj nazwisko:");
        uczen.nazwisko = scan.nextLine();

        System.out.println("Podaj swój wiek:");
        uczen.wiek = Integer.parseInt(scan.nextLine());

        System.out.println("Twoje dane:");
        System.out.println(uczen.imie + " " + uczen.nazwisko + " " + uczen.wiek + "lat" + " ");

    }

}