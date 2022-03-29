import java.util.*;

public class VerwerkUserInput {

    //krijgt de custom parameters aangegeven in de (nog te maken) GUI
    public void startZoekProcess(String userWebsite, Integer userTijdsinterval, String userZoekterm){
        System.out.printf("de gekregen parameters zijn:%s %d %s\n", userWebsite, userTijdsinterval, userZoekterm);
        new ZoekProcessor().process(userWebsite,userTijdsinterval,userZoekterm);
    }
}
