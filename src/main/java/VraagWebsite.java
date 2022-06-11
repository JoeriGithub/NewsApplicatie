import java.text.ParseException;

public abstract class VraagWebsite implements IWebsiteFactory {

    protected String titel;
    protected String url;
    protected String artikelFormat = "";

    @Override
    public abstract String verzamelGegevens(String zoekterm, int tijdsinterval);

    @Override
    public abstract void datumCheck(String artikel, int tijdsinterval) throws ParseException;

    @Override
    public abstract void opmaakArtikel(String artikel);
}
