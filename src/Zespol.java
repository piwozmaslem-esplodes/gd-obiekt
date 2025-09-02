import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zespol {
    private  Nauczyciel naucz;
    private ArrayList<Uczen> klasa;

    public Zespol(Nauczyciel naucz, ArrayList<Uczen> klasa) {
        this.naucz = naucz;
        this.klasa = klasa;
    }
    private void dodaj(Uczen uczen){
        klasa.add(uczen);
    }
}
