import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.IOException;

public class ZoekactieUitvoeren {
    private String correctFormaatArtikelen = "";

    //maakt een connectie om de infromatie van het internet af te halen
    public void VerzamelGegevens(String zoekterm, int tijdsinterval, String website) {
        String url = "https://www.nu.nl/zoeken?q=" + zoekterm;
        try {
            Document doc = Jsoup.connect(url).get();
            Elements el = doc.select(".item-title");
            for (Element e : el) {
                correctFormaatArtikelen = correctFormaatArtikelen + "\n" + e.text();
            }
            new PrintResutaatZoekactie().printGegevens(correctFormaatArtikelen);
        }
        catch (IOException e) {
            System.err.printf("error, fout in de connectie met de website (%s)\n", e);
        }
    }
    public String getCorrectFormaatArtikelen(){
        return correctFormaatArtikelen;
    }
}
