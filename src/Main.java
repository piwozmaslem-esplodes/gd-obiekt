//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Uczen uczen1 = new Uczen("jeden", 13);
        System.out.println(Uczen.getLiczbaUcznia());
        System.out.println(uczen1);

        Uczen uczen2 = new Uczen("dwa", 134);
        System.out.println(Uczen.getLiczbaUcznia());
        System.out.println(uczen2);

        Uczen uczen3 = new Uczen("trzy", 15);
        System.out.println(Uczen.getLiczbaUcznia());
        System.out.println(uczen3);

    }
}