import java.text.ParseException;

public interface IWebsiteFactory {

    String verzamelGegevens(String zoekterm, int tijdsinterval);

    void datumCheck(String artikel, int tijdsinterval) throws ParseException;

    void opmaakArtikel(String artikel);
}
