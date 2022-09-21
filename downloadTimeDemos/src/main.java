import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen internet hızını Mbps cinsinden yazınız.");
        double mbpsSpeed = sc.nextInt();



        System.out.println("||==============>");

        System.out.println("Dosya Boyutunu küsüratsız bir şeklde yazınız. Örn: 125");

        double fileSize = sc.nextInt();

        // we convert size from Gb to megabyte
        double fileSizeMb = fileSize * 1024;

        double dwnlPerSec = fileSizeMb /8;

        double userSpeed = mbpsSpeed/8;

        double avarageTimeSec = dwnlPerSec/userSpeed;
        double avarageTimeMin = avarageTimeSec ;


        System.out.println("İndirme süreniz ortalama "+ avarageTimeMin +" dakikadır.");


    }
}
