public abstract class Parameter {
    protected String website;
    protected int tijdsinterval;
    protected String zoekterm;

    public Parameter(String website, int tijdsinterval, String zoekterm){
        this.website = website;
        this.tijdsinterval = tijdsinterval;
        this.zoekterm = zoekterm;
    }


    public abstract int getTijdsinterval();

    public abstract String getWebsite();

    public abstract String getZoekterm();

}
