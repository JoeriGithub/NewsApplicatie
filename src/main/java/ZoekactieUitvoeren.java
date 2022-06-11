public class ZoekactieUitvoeren {
    //roept WebsiteCreator aan om de abstract factory te starten
    public void verzamelGegevens(String zoekterm, int tijdsinterval, String website) {
        String WebsiteCreator = new WebsiteCreator().getWebsiteFactory(zoekterm, tijdsinterval, website);
        new PrintResutaatZoekactie().printGegevens(WebsiteCreator);
    }
}
