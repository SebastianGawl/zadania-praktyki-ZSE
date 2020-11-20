package Giereczka;

public class DanneGracza {
    public static String nick;
    public String getNick(){
        return  "Gracz o pseudonimie: " + this.nick;
    }
    void setNick(String nick) {
        if (nick.length() >= 3) {
            this.nick = nick;
        }
        else {
            System.out.println("Pseudonim musi zawierać więcej liter niż 3");
        }

    }
}