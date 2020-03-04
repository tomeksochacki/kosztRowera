public class KosztRowera {
    public static void main(String[] args) {

        int cenaRowera = 1100;
        int liczbaOsodDoZrzutki = 5;

        int kwotaNaGlowke = cenaRowera / liczbaOsodDoZrzutki;

        System.out.println("Każda osoba ma do zapłacenia " + kwotaNaGlowke + " zł");
    }
}
