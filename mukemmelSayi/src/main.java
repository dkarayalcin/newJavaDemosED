import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total= 0;


        for (int i = 1;i<a;i++){
            if(a%i==0) {
                total= total+i;

            }

        }
        if (total == a ){
            System.out.println("Mükemmel sayı");
        } else {
            System.out.println("Mükemmel sayı değil.");
        }

    }
}
