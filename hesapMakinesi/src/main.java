import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // giriş mesajı
        Scanner sc =new Scanner (System.in);
            System.out.println("Lütfen işlem yapacağınız ilk sayıyı girin");
        float num1= sc.nextFloat();
            System.out.println("Lütfen işlem yapacağınız ikinci sayıyı girin");
        float num2= sc.nextFloat();
        System.out.println("Lütfen yapmak istediğiniz işleme atanan rakamı tuşlayınız.");
        System.out.println("Topama içi 1");
        System.out.println("Çıkartma için 2");
        System.out.println("Çarpma için 3");
        System.out.println("Bölme işlemi için 4");


        int operator= sc.nextInt();

        if( operator==1) {
            System.out.println("Sonuç: " + (num1 + num2 ));

        }
            else if ( operator == 2) {
            System.out.println("Sonuç: " + (num1 - num2 ));
        }
            else if (operator==3) { System.out.println("Sonuç: " + (num1 * num2 ));

        }
            else {
            System.out.println("Sonuç: " + (num1 / num2 ));
        }

    }
}
