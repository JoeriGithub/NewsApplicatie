public class PrintResutaatZoekactie {

    public void printGegevens(String artikelen){
        System.out.printf("er zijn %d teruggekomen artikelen:\n %s",aantalRegels(artikelen) , artikelen);
        System.out.println("\ndit is het einde van het programma");
    }

    public int aantalRegels(String tekst){
        int lines = 1;
        int pos = 0;
        while ((pos = tekst.indexOf("\n", pos) + 1) != 0) {
            lines++;
        }
        return lines;
    }

}
