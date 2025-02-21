import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EvidenceDeskovky {

    private ArrayList<Deskovka> seznam;

    public EvidenceDeskovky(){
        this.seznam = new ArrayList<>();
    }

    public void pridatDeskovku(Deskovka deskovka) {
        seznam.add(deskovka);
    }

    public void zobrazDeskovky() {
        seznam.forEach(System.out::println);
    }

    public void nactiZeSouboru(String soubor) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(soubor))) {
            String line;
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(";");
                String nazev = parts[0];
                String vstupBoolean = parts[1];
                boolean jeKoupena = vstupBoolean.equals("ano");
                int hodnoceni = Integer.parseInt(parts[2]);
                Deskovka deskovka = new Deskovka(nazev,jeKoupena, hodnoceni);
                seznam.add(deskovka);
            }
        }
    }


}
