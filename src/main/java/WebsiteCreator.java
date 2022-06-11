
public class WebsiteCreator {
    public String getWebsiteFactory(String zoekterm, int tijdsinterval, String website) {
        switch(website.toLowerCase()) {
            case "www.nu.nl":
                return new WebsiteNu().verzamelGegevens(zoekterm, tijdsinterval);
            case "www.wsj.com":
                return new WebsiteWSJ().verzamelGegevens(zoekterm, tijdsinterval);
        }
        return "de website is niet goed ingevoerd";
    }
}