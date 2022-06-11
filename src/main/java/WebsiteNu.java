import org.jsoup.Jsoup;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebsiteNu extends VraagWebsite{

    public String verzamelGegevens(String zoekterm, int tijdsinterval) {
        for (int i = 1; i < 11; i++) {
            String url = "https://search.snmmd.nl/search/?q=" + zoekterm + "&page=" + i + "&per_page=1&channel=nu2&ks=0&r=1";
            try {
                String json = Jsoup.connect(url).ignoreContentType(true).execute().body();
                this.datumCheck(json, tijdsinterval);
            }
            catch (IOException | ParseException e) {
                System.err.printf("error, fout in de connectie met de website (%s)\n", e);
            }
        }
        return artikelFormat;
    }

    public void datumCheck(String json, int tijdsinterval) throws ParseException {
        String regex = "([0-9]{2}-[0-9]{2}-[0-9]{4})";
        Matcher m = Pattern.compile(regex).matcher(json);
        if (m.find()) {
            Date ArtikelDate = new SimpleDateFormat("dd-MM-yyyy").parse(m.group(1));
            LocalDate ArtikelLocalDate = ArtikelDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            LocalDate Vandaag = LocalDate.now();
            LocalDate BeginDatum = Vandaag.minusDays(tijdsinterval);

            if (ArtikelLocalDate.equals(BeginDatum) || ArtikelLocalDate.isAfter(BeginDatum)) {
                this.opmaakArtikel(json);
            }
        }
        else {
            System.out.println("no match");
        }
    }

    public void opmaakArtikel(String artikel) {
        for (int i = 0; i < (artikel.length() - artikel.replace(artikel.substring(artikel.indexOf("title") + 8, artikel.indexOf("url") - 3), "").length()) / artikel.substring(artikel.indexOf("title") + 8, artikel.indexOf("url") - 3).length(); i++) {

            titel = artikel.substring(artikel.indexOf("title") + 8, artikel.indexOf("url") - 3);
            url = artikel.substring(artikel.indexOf("url") + 7, artikel.indexOf("label") - 4);

            artikelFormat = artikelFormat + titel +" "+ url + "\n";
        }
    }
}
