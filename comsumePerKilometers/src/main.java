import java.util.Scanner;

public class main {

    public static void main(String [] args) {

        System.out.println("Merhaba...");
        Scanner sc = new Scanner(System.in);
        //How much does fuel
        System.out.println("Lütfen aracınızın kilometre başına  kaç kuruş yaktığını tuşlayınız. Örn: 0,34");
        double consumePKM= sc.nextDouble();
        System.out.println("Lütfen güzergah mesafesini km cinsinden yazınız.Örn: 85,8");
        double routeDistance = sc.nextDouble();
        System.out.println("Lütfen kulladığınız yakıtın litresinin ücretini tuşlayınız. Örn: 20,54 ");
        double fuelPricePerLiter = sc.nextDouble();

        double totalConsumeFuelPrice = consumePKM * routeDistance;
        double totalConsumeFuel= totalConsumeFuelPrice/fuelPricePerLiter;
        System.out.println("Tahmini yakıt  tüketiminiz "+ totalConsumeFuelPrice +" Türk Lirasıdır.");
        System.out.println("Tahmini yakıt  tüketiminiz "+ totalConsumeFuel +" litredir.");




    }
}
