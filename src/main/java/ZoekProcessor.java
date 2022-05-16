import java.io.IOException;
import java.util.ArrayList;

public class ZoekProcessor {

    private Parameter parameter;
    private String zoekterm;
    private String website;
    private Integer tijdsinterval;

    public static int testwaardecounter;//Dit is om de testen goed uit te kunnen voeren.

    public static int getTestwaardeCounter(){
        int temptestwaardecounter = testwaardecounter;
        testwaardecounter = 0;
        return temptestwaardecounter;
    }

    public void process(String userWebsite, Integer userTijdsinterval, String userZoekterm) {
        
        zoekterm = userZoekterm;
        website = userWebsite;
        tijdsinterval = userTijdsinterval;

        //kijkt of de ingevoerde parameters leeg zijn
        if(userZoekterm == "null"){
            parameter = new Zoekterm(userWebsite, userTijdsinterval, userZoekterm);
            System.out.printf("niks ingevuld bij zoekterm, vervangen door: %s\n", parameter.zoekterm);
            zoekterm = parameter.zoekterm;
            testwaardecounter++;//voor testen
        }
        if (userTijdsinterval == 0){
            parameter = new Tijdsinterval(userWebsite,userTijdsinterval,userZoekterm);
            System.out.printf("niks ingevuld bij tijdsinterval, vervangen door: %s\n", parameter.tijdsinterval);
            tijdsinterval = parameter.tijdsinterval;
            testwaardecounter++;//voor testen
        }
        if (userWebsite == "null") {
            parameter = new Website(userWebsite, userTijdsinterval, userZoekterm);
            System.out.printf("niks ingevuld bij website, vervangen door: %s\n", parameter.website);
            website = parameter.website;
            testwaardecounter++;//voor testen
        }
        naarUitvoeren(zoekterm, tijdsinterval, website);

    }
    public void naarUitvoeren(String website, Integer tijdsinterval, String zoekterm) {
        new ZoekactieUitvoeren().VerzamelGegevens(website,tijdsinterval,zoekterm);
    }

    public String getWebsite(){
        return website;
    }
    public String getZoekterm(){
        return zoekterm;
    }
    public Integer getTijdsinterval(){
        return tijdsinterval;
    }
}
