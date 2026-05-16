public class TESTER extends PRACOWNIK {

    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public TESTER(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {return czyAutomatyzujacy;}
    public void setCzyAutomatyzujacy(boolean czyAutomatyzujacy) {this.czyAutomatyzujacy = czyAutomatyzujacy;}
    public int getLiczbaScenariuszy() {return liczbaScenariuszy;}
    public void setLiczbaScenariuszy(int liczbaScenariuszy) {this.liczbaScenariuszy = liczbaScenariuszy;}

    @Override
    public double obliczKosztMiesieczny() {
        return super.obliczKosztMiesieczny();
    }

    @Override
    public String przedstawSie() {
        return "Tester: " + super.przedstawSie();
    }

    public String uruchomRaportTestow(){
        return "ID Testera: " + pobierzIdPracownika() + "\nLiczba Scenariuszy: " + liczbaScenariuszy;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLiczba Scenariuszy: " + liczbaScenariuszy;
    }
}