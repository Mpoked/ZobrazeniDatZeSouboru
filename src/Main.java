import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;

public class Main {

    public static void main(String[] args) {


    EvidenceDeskovky evidenceDeskovky = new EvidenceDeskovky();
    String soubor = "deskovky";

    try {
        evidenceDeskovky.nactiZeSouboru(soubor);
        evidenceDeskovky.zobrazDeskovky();
    } catch (IOException e){
        System.err.println(e.getMessage());
    }

    }
}