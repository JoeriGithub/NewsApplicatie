public class Zoekterm extends Parameter{

    public Zoekterm(String website, int tijdsinterval, String zoekterm) {
        super(website, tijdsinterval, zoekterm);
        zoekterm = getZoekterm();
    }


    @Override
    public int getTijdsinterval() {
        return tijdsinterval;
    }

    @Override
    public String getWebsite() {
        return website;
    }

    //als er geen zoekterm is opgegeven geven we een standaard waarde (dit zal later uit een json file komen)
    @Override
    public String getZoekterm() {
        zoekterm = "geld";
        return zoekterm;
    }
}
