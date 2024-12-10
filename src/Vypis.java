import java.util.Scanner;

public class Vypis {

    Scanner sc = new Scanner(System.in);

    public void vypisAhoj() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + " Ahoj světe");
        }
    }
    public void vypisNactenehoSlova() {
        System.out.println("Zadej sem slovo dík");
        String slovo = sc.nextLine();
        System.out.println(slovo);
    }
    public void vypisNactenehoCisla() {
        System.out.println("Zadej sem cislo dík");
        int cislo = sc.nextInt();

        if (cislo < 0) {
            System.out.println("Číslo je záporné");
        }
        else if (cislo == 0) {
            System.out.println("0");
        }
        else if (cislo > 12) {
            System.out.println("Moc velké číslo");
        }
        else if (cislo == 12) {
            System.out.println("dvanáct");
        }
        else if (cislo == 11) {
            System.out.println("jedenáct");
        }
        else if (cislo == 10) {
            System.out.println("deset");
        }
        else if (cislo == 9) {
            System.out.println("devět");
        }
        else if (cislo == 8) {
            System.out.println("osm");
        }
        else if (cislo == 7) {
            System.out.println("sedm");
        }
        else if (cislo == 6) {
            System.out.println("šest");
        }
        else if (cislo == 5) {
            System.out.println("pět");
        }
        else if (cislo == 4) {
            System.out.println("čtyři");
        }
        else if (cislo == 3) {
            System.out.println("tři");
        }
        else if (cislo == 2) {
            System.out.println("dva");
        }
        else if (cislo == 1) {
            System.out.println("jedna");
        }
    }
    public void nasobekPetky() {
        for (int i = 1; i <= 20; i++) {
            int nasobek = i * 5;
            System.out.println(nasobek);
        }
    }
    public void prvocislo() {
        System.out.println("Zadej sem číslo");
        int cislo = sc.nextInt();
    }
}
