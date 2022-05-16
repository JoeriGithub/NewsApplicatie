public class Website extends Parameter {

    public Website(String Website, int tijdsinterval, String Zoekterm) {
        super(Website, tijdsinterval, Zoekterm);
        website = getWebsite();
    }

    @Override
    public int getTijdsinterval() {
        return tijdsinterval;
    }

    //als er geen zoekterm is opgegeven geven we een standaard waarde (dit zal later uit een json file komen)
    @Override
    public String getWebsite() {
        return "www.nu.nl";
    }


    @Override
    public String getZoekterm() {
        return zoekterm;
    }
}
