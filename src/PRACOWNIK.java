public class PRACOWNIK {

        private String idPracownika;
        private String imie;
        private String nazwisko;
        private double stawkaBazowa;

    public PRACOWNIK(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    public String getIdPracownika() {return idPracownika;}
    public String getImie() {return imie;}
    public void setImie(String imie) {this.imie = imie;}
    public String getNazwisko() {return nazwisko;}
    public void setNazwisko(String nazwisko) {this.nazwisko = nazwisko;}
    public double getStawkaBazowa() {return stawkaBazowa;}
    public void setStawkaBazowa(double stawkaBazowa) {this.stawkaBazowa = stawkaBazowa;}

    public final String pobierzIdPracownika(){
        return idPracownika;
    }

    public double obliczKosztMiesieczny(){
        double emerytalne = stawkaBazowa * 0.0976;
        double rentowe = stawkaBazowa * 0.065;
        double wypadkowe = stawkaBazowa * 0.0167;
        double funduszPracy = stawkaBazowa * 0.0245;
        double fgsp = stawkaBazowa * 0.001;

        double koszt = stawkaBazowa + emerytalne + rentowe + wypadkowe + funduszPracy + fgsp;

        return koszt;
    }

    public String przedstawSie(){
        return imie + " " + nazwisko;
    }

    @Override
    public String toString() {
        return  "ID: " + idPracownika +
                "\nImie: " + imie +
                "\nNazwisko: " + nazwisko +
                "\nStawka bazowa: " + stawkaBazowa +
                "\nKoszty Miesieczne: " + obliczKosztMiesieczny();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PRACOWNIK other = (PRACOWNIK) o;
        return this.idPracownika.equals(other.idPracownika);
    }
}