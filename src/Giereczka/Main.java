package Giereczka;
import java.util.Scanner;

public class Main extends RandomoweNumery
{
    public static void main(String[] args)
    {

        int wynik = 150;
        int NumerGry = 0;

        System.out.println("\n BlackJack \n\n Zasady: Z dobieranych losowych liczb [od 1 do 14] staramy się uzyskać sumę jak najbliżej 21 punktów, jednak nie przekraczając 21 \n Gra składa się z 10 tur. ");
        System.out.println("Sterowanie:");
        System.out.println(" H - Dobiera kartę \n S - Nie dobiera karty [PASS]");
        System.out.println("\n Zaczynasz ze 150$");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Podaj swój pseudonim");
        DanneGracza nick= new DanneGracza();
        //nick.setNick("gracz");
        DanneGracza.nick =scanner.nextLine();




        while (NumerGry <10) {
            int n1 = rndRange(1,14);

            System.out.println("\n");
            System.out.println("Tura " + (Tura.Liczba + NumerGry));
            System.out.println ("[Rozegranie] Wylosowana karta: " + n1);


            int total = n1;

            while (total < 21)
            {
                System.out.println("H [hit] Czy S [stand]: ");
                String input = scanner.nextLine();

                if (input.endsWith("h") || input.endsWith("H"))
                {
                    int n2 = rndRange(1,14);
                    System.out.println("Dobrana karta: " + n2);
                    total = total + n2;

                }
                if (input.endsWith("s") || input.endsWith("S"))
                {
                    break;
                }
                System.out.println("Suma punktów : " + total);

            }
            // System dodawania gotówki
            if (total < 8){
                System.out.println("bilans: $" + wynik);
            }
            if (total >= 8 && total <= 11){
                wynik = wynik + 25;
                System.out.println("bilans: $" + wynik);
            }
            if (total >= 12 && total <= 15){
                wynik = wynik + 50;
                System.out.println("bilans: $" + wynik);
            }
            if (total >= 16 && total <= 20){
                wynik = wynik + 75;
                System.out.println("bilans: $" + wynik);
            }
            if (total == 21){
                wynik = wynik + 100;
                System.out.println("bilans: $" + wynik);
            }
            if (total >21){
                wynik = wynik - 100;
                System.out.println("bilans: $" + wynik);
            }
            System.out.println("końcowa suma punktów w turze: " + total);

            if (wynik > 0){
                NumerGry++; //Koniec pentli
            }
            if (wynik <= 0){
                break;
            }

        }

        System.out.println("\n koniec gry! \n bilans: $" + wynik);
        System.out.println(nick.getNick());

    }

}
