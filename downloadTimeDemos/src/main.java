import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen internet hızını Mbps cinsinden yazınız.");
        double mbpsSpeed = sc.nextInt();



        System.out.println("||==============>");

        System.out.println("Dosya Boyutunu küsüratsız bir şeklde yazınız. Örn: 125");

        double fileSize = sc.nextInt();
         System.out.println("||==============>");

     
        // we convert Gb in to Mbps format and print out how many minutes we need to download. eta.
        double fileSizeMb = fileSize * 1024*8 ;




        double xxx= fileSizeMb/mbpsSpeed;




        System.out.println("İndirme süreniz ortalama "+ xxx/60 +" dakikadır.");


        System.out.println("İndirme süreniz ortalama "+ avarageTimeMin +" dakikadır.");


    }
}
