import org.jsoup.Jsoup;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class WebsiteWSJ extends VraagWebsite {

    public String verzamelGegevens(String zoekterm, int tijdsinterval) {
        for (int i = 1; i < 9; i++) {
            String url = "https://newsapi.org/v2/everything?domains=wsj.com&q=" + zoekterm + "&pageSize=1&page=" + i + "&apiKey=52cf2f9c57534752acaa8f0696586958";
            try {
                String json = Jsoup.connect(url).ignoreContentType(true).execute().body();
                this.datumCheck(json, tijdsinterval);
            } catch (IOException | ParseException e) {
                System.err.printf("error, fout in de connectie met de website (%s)\n", e);
                break;
            }
        }
        return artikelFormat;
    }

    public void datumCheck(String json, int tijdsinterval) throws ParseException {
        String artikelStringDatum = json.substring(json.indexOf("publishedAt") + 14, json.indexOf("content") - 13);
        Date artikelDate = new SimpleDateFormat("yyyy-MM-dd").parse(artikelStringDatum);
        LocalDate artikelLocalDate = artikelDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        LocalDate today = LocalDate.now();
        LocalDate BeginDatum = today.minusDays(tijdsinterval);

        if (artikelDate.equals(BeginDatum) || artikelLocalDate.isAfter(BeginDatum)) {
            this.opmaakArtikel(json);
        }
    }
    public void opmaakArtikel(String artikel) {

        for (int i = 0; i < (artikel.length() - artikel.replace(artikel.substring(artikel.indexOf("title") + 7, artikel.indexOf("description") - 2), "").length()) / artikel.substring(artikel.indexOf("title") + 7, artikel.indexOf("description") - 2).length(); i++) {

            titel = artikel.substring(artikel.indexOf("title") + 7, artikel.indexOf("description") - 2);
            url = artikel.substring(artikel.indexOf("url") + 6, artikel.indexOf("urlToImage") - 3);

            artikelFormat = artikelFormat + titel +" "+ url + "\n";
        }
    }
}
