import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        int mNum = sc.nextInt();
        int reminder = 0;
        boolean isPrime = false;


        for (int i = 2; i < mNum; i++) {


            if (mNum % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }


        }
        if (isPrime) {
            System.out.println("Sayı Asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }


    }

}
