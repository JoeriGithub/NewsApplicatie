import java.util.*;

public class VerwerkUserInput {

    public void startZoekProces(){
        String userWebsite;
        String userZoekterm;
        Integer userTijdsinterval;
        Scanner input = new Scanner(System.in);
        System.out.println("Als je een waarde niet wilt invoeren, typ dan 'null' of bij tijdsinterval '0'");
        System.out.printf("op welke website wil je zoeken? \nje kan kiezen tussen www.nu.nl, www.wsj.com\n");
        userWebsite = input.nextLine();
        System.out.println("welke zoekterm wil je gebruiken?");
        userZoekterm = input.nextLine();
        System.out.println("wat is het tijdsinterval in dagen?");
        userTijdsinterval = input.nextInt();
        new ZoekProcessor().process(userWebsite,userTijdsinterval,userZoekterm);
    }
}
