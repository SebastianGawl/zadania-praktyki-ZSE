package zadania1;

public class klient extends Human {
    
    protected int numer_telefonu;
    protected String adres;
    boolean czy_zamowil;
    String[] produkt;
    
    public klient(double wzrost, char palec, double rozmiar_buta, boolean czy_lysy, String color_wlosow, int wiek, Human[] rodzice, String adres,int numer_telefonu, boolean czy_zamowil, String[] produkt) {
        super(wzrost, palec, rozmiar_buta, czy_lysy, color_wlosow, wiek, rodzice);
        this.adres = adres;
        this.numer_telefonu = numer_telefonu;
        this.czy_zamowil = czy_zamowil;
        this.produkt = produkt;
                
                
    } 
}
