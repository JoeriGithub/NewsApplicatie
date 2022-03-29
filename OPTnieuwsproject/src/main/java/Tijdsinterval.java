public class Tijdsinterval extends Parameter{

    public Tijdsinterval(String Website, int tijdsinterval, String Zoekterm) {
        super(Website, tijdsinterval, Zoekterm);
        tijdsinterval = getTijdsinterval();
    }

    //als er geen tijdsinterval is opgegeven geven we een standaard waarde (dit zal later uit een json file komen)
    @Override
    public int getTijdsinterval() {
        tijdsinterval = 2;
        return tijdsinterval;
    }

    @Override
    public String getWebsite() {
        return website;
    }

    @Override
    public String getZoekterm() {
        return zoekterm;
    }
}
