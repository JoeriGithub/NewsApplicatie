import org.junit.*;

public class JUnittest {

    //kijkt of de lege waardes in zoekprocessor correct worden overschreven
    //De lege parameters moeten vervangen worden met de default waardes
    @Test
    public void testZoekprocessor(){
        String website = "null";
        Integer tijdsinterval = 0;
        String zoekterm = "null";

        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        Assert.assertEquals("www.nu.nl", ZPr.getWebsite());
        Assert.assertEquals((Integer) 2, ZPr.getTijdsinterval());
        Assert.assertEquals("geld", ZPr.getZoekterm());
    }

    //kijkt of er resultaten terug worden gegeven van ZoekactieUitvoeren
    //(geeft een lege String terug als er niet goed gezocht wordt dus dit wordt getest)
    @Test
    public void testZoekactie(){
        ZoekactieUitvoeren ZUi = new ZoekactieUitvoeren();
        ZUi.VerzamelGegevens("test", 1, "www.nu.nl");
        Assert.assertNotSame("", ZUi.getCorrectFormaatArtikelen());
    }

    //kijkt of aantalRegels het juiste aantal regels teruggeeft
    @Test
    public void testPrintResultaat(){
        String tekst1 = "regel1\nregel2\nregel3\nregel4";
        String tekst2 = "regel1\nregel2\nregel3\nregel4\nregel5\nregel6\nregel7";
        String tekst3 = "regel1";
        String tekst4 = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11";

        PrintResutaatZoekactie PRZ = new PrintResutaatZoekactie();
        int actual = PRZ.aantalRegels(tekst1);
        Assert.assertEquals(4, actual);

        actual = PRZ.aantalRegels(tekst2);
        Assert.assertEquals(7, actual);

        actual = PRZ.aantalRegels(tekst3);
        Assert.assertEquals(1, actual);

        actual = PRZ.aantalRegels(tekst4);
        Assert.assertEquals(11, actual);
    }
}
