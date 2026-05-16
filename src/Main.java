public class Main {
    public static void main(String[] args) {
        ZespolProjektowy zespol = new ZespolProjektowy("Campus App");

        PRACOWNIK p1 = new PROGRAMISTA("E-101", "Anna", "Maj", 12000.0, "Java", 4);
        PRACOWNIK p2 = new TESTER("E-201", "Piotr", "Lis", 9800.0, true, 25);
        PRACOWNIK p3 = new PROGRAMISTA("E-102", "Karol", "Wojcik", 11500.0, "Kotlin", 3);

        zespol.dodajPracownika(p1);
        zespol.dodajPracownika(p2);
        zespol.dodajPracownika(p3);

        zespol.wypiszSkladZespolu();
        System.out.println("Łączny koszt zespołu: " + zespol.policzLacznyKoszt());

        System.out.println(p1.przedstawSie());
        System.out.println(p2.przedstawSie());

        if (p1 instanceof PROGRAMISTA) {
            PROGRAMISTA programista = (PROGRAMISTA) p1;
            programista.wypiszTechnologie();
        }

        System.out.println(p2.equals(new TESTER("E-201", "Inne", "Dane", 9000.0, false, 10)));
        System.out.println(p2);
    }
}