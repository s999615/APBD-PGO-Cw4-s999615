public class PROGRAMISTA extends PRACOWNIK {

    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public PROGRAMISTA(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public String getGlownyJezyk() {return glownyJezyk;}
    public void setGlownyJezyk(String glownyJezyk) {this.glownyJezyk = glownyJezyk;}
    public int getLiczbaRepozytoriow() {return liczbaRepozytoriow;}
    public void setLiczbaRepozytoriow(int liczbaRepozytoriow) {this.liczbaRepozytoriow = liczbaRepozytoriow;}

    @Override
    public double obliczKosztMiesieczny() {
        return super.obliczKosztMiesieczny();
    }

    @Override
    public String przedstawSie() {
        return "Programista: " + super.przedstawSie();
    }

    public String wypiszTechnologie(){
        return "Glowny Jezyk Programowania: " + glownyJezyk +
                "\nLiczba Repozytoriow: " + liczbaRepozytoriow;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + wypiszTechnologie();
    }

}