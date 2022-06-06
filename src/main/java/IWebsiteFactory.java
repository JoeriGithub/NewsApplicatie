import java.text.ParseException;

public interface IWebsiteFactory {

    String VerzamelGegevens(String zoekterm, int tijdsinterval);

    void DatumCheck(String artikel, int tijdsinterval) throws ParseException;

    void OpmaakArtikel(String artikel);
}
