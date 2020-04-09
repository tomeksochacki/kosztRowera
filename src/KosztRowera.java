import java.util.Scanner;

public class KosztRowera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to price a bike: ");
        double priceBike = scanner.nextDouble();
        System.out.println("Enter to apount people: ");
        double amountPeople = scanner.nextDouble();

        double priceForOnePeople = priceBike / amountPeople;

        System.out.println("The person has to pay: " + priceForOnePeople + " zł");
    }
}
