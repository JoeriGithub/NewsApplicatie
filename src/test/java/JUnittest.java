import org.junit.*;

public class JUnittest {
    @Test
    public void MCDCtest111(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst

        //voorwaardeC is in dit geval true want er wordt een zoekactie uitgevoerd
        voorwaardeC = true;

        String website = "rtlnieuws.nl";
        Integer tijdsinterval = 7;
        String zoekterm = "strand";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter(); //telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }
        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertTrue(besluitD);
    }

    @Test
    public void MCDCtest011(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst

        //voorwaardeC is in dit geval true want er wordt een zoekactie uitgevoerd
        voorwaardeC = true;

        String website = "rtlnieuws.nl";
        Integer tijdsinterval = 7;
        String zoekterm = "null";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }

        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertFalse(besluitD);

    }
    @Test
    public void MCDCtest101(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst

        //voorwaardeC is in dit geval true want er wordt een zoekactie uitgevoerd
        voorwaardeC = true;

        String website = "rtlnieuws.nl";
        Integer tijdsinterval = 0;
        String zoekterm = "null";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }

        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertFalse(besluitD);

    }
    @Test
    public void MCDCtest110(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst



        String website = "rtlnieuws.nl";
        Integer tijdsinterval = 7;
        String zoekterm = "strand";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }

        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertFalse(besluitD);
    }


    @Test
    public void equivalentietests(){

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                String website = "null";
                Integer tijdsinterval = 0;
                String zoekterm = "null";
                ZoekProcessor ZPr = new ZoekProcessor();
                ZPr.process(website,tijdsinterval,zoekterm);
                int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes
                Assert.assertEquals(3, testwaardecounter);
            }
            else if (i == 1) {
                String website = "nieuws.nl";
                Integer tijdsinterval = 0;
                String zoekterm = "null";
                ZoekProcessor ZPr = new ZoekProcessor();
                ZPr.process(website,tijdsinterval,zoekterm);
                int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes
                Assert.assertEquals(2, testwaardecounter);
            }
            else if (i == 2) {
                String website = "nieuws.nl";
                Integer tijdsinterval = 5;
                String zoekterm = "null";
                ZoekProcessor ZPr = new ZoekProcessor();
                ZPr.process(website,tijdsinterval,zoekterm);
                int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes
                Assert.assertEquals(1, testwaardecounter);
            }
            else if (i == 3) {
                String website = "nieuws.nl";
                Integer tijdsinterval = 5;
                String zoekterm = "oorlog";
                ZoekProcessor ZPr = new ZoekProcessor();
                ZPr.process(website,tijdsinterval,zoekterm);
                int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes
                Assert.assertEquals(0, testwaardecounter);
            }

        }
    }
    @Test
    public void pairwise1(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst

        String website = "null";
        Integer tijdsinterval = 0;
        String zoekterm = "null";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }

        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertFalse(besluitD);
    }
    @Test
    public void pairwise2(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst

        //voorwaardeC is in dit geval true want er wordt een zoekactie uitgevoerd
        voorwaardeC = true;

        String website = "null";
        Integer tijdsinterval = 4;
        String zoekterm = "Oorlog";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }

        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertFalse(besluitD);
    }
    @Test
    public void pairwise3(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst



        String website = "nos.nl";
        Integer tijdsinterval =0;
        String zoekterm = "null";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }

        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertFalse(besluitD);
    }
    @Test
    public void pairwise4(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst

        //voorwaardeC is in dit geval true want er wordt een zoekactie uitgevoerd
        voorwaardeC = true;

        String website = "nos.nl";
        Integer tijdsinterval = 4;
        String zoekterm = "Oorlog";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }

        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertTrue(besluitD);
    }
    @Test
    public void pairwise5(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst

        //voorwaardeC is in dit geval true want er wordt een zoekactie uitgevoerd
        voorwaardeC = true;

        String website = "nieuws.nl";
        Integer tijdsinterval = 0;
        String zoekterm = "Oorlog";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }

        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertFalse(besluitD);
    }
    @Test
    public void pairwise6(){
        boolean voorwaardeA = false; //Er is een zoekactie met een website
        boolean voorwaardeB = false; //Er is een zoekactie met een zoekterm en tijdsinterval
        boolean voorwaardeC = false; //Er wordt een zoekactie uitgevoerd
        boolean besluitD = false; //uitkomst



        String website = "nieuws.nl";
        Integer tijdsinterval = 0;
        String zoekterm = "null";
        ZoekProcessor ZPr = new ZoekProcessor();
        ZPr.process(website,tijdsinterval,zoekterm);
        int testwaardecounter = ZoekProcessor.getTestwaardeCounter();//telt aantal standaard waardes

        if (voorwaardeC) {
            if (!website.equals("null")){
                voorwaardeA = true;
            }
            if (!zoekterm.equals("null") && tijdsinterval != 0){
                voorwaardeB = true;
            }
        }

        if (((voorwaardeA && voorwaardeB) && voorwaardeC) && testwaardecounter == 0){
            besluitD = true;
        }

        Assert.assertFalse(besluitD);
    }

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
