package Kwiatek;

public class Kwiatek {
    String nazwa;
    String NazwaŁacińska;
    String KolorLiści = "zielony";
    String KolorPłatków;

    boolean CzyJestTrujący;

    public void setNazwa (String nazwa){
        this.nazwa = nazwa;
    }
    public void setNazwaŁacińska (String NazwaŁacińska) {
        this.NazwaŁacińska = NazwaŁacińska;
    }
    public void setKolorLiści (String KolorLiści) {
        this.KolorLiści = KolorLiści;
    }
    public void setKolorPłatków (String KolorPłatków) {
        this.KolorPłatków = KolorPłatków;
    }
    public void setCzyJestTrujący(boolean CzyJestTrujący){
        this.CzyJestTrujący = CzyJestTrujący;
    }
}
