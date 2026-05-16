import java.util.ArrayList;

public class ZespolProjektowy {

    private String nazwaProjektu;
    private ArrayList<PRACOWNIK> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public String getNazwaProjektu() {return nazwaProjektu;}
    public void setNazwaProjektu(String nazwaProjektu) {this.nazwaProjektu = nazwaProjektu;}
    public ArrayList<PRACOWNIK> getPracownicy() {return pracownicy;}
    public void setPracownicy(ArrayList<PRACOWNIK> pracownicy) {this.pracownicy = pracownicy;}


    public void dodajPracownika(PRACOWNIK pracownik) {pracownicy.add(pracownik);}

    public String wypiszSkladZespolu() {
        String skladZespolu = "";
        for (PRACOWNIK pracownik : pracownicy) {
            skladZespolu += "\n " + pracownik.pobierzIdPracownika() + " " + pracownik.getImie() + " " + pracownik.getNazwisko();
        }
        return skladZespolu;
    }

    public double policzLacznyKoszt(){
        double lacznyKoszt = 0.0;
        for (PRACOWNIK pracownik : pracownicy) {
            double pojedynczyKoszt = pracownik.obliczKosztMiesieczny();
            lacznyKoszt += pojedynczyKoszt;
        }
        return lacznyKoszt;
    }

    public String wypiszProgramistow() {
        String programisci = "";
        for (PRACOWNIK pracownik : pracownicy) {
            if (pracownik instanceof PROGRAMISTA) {
                programisci += "\n" + pracownik.przedstawSie();
            }
        }
        return programisci;
    }

    public String wypiszTesterowAutomatyzujacych() {
        String testerzy = "";
        for (PRACOWNIK pracownik : pracownicy) {
            if (pracownik instanceof TESTER) {
                TESTER tester = (TESTER) pracownik;
                if (tester.isCzyAutomatyzujacy()) {
                    testerzy += "\n" + tester.przedstawSie();
                }
            }
        }
        return testerzy;
    }
}