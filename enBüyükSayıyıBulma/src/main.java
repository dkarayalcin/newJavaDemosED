import java.util.Scanner;

import static java.lang.System.*;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
             double a = sc.nextDouble();
             double b = sc.nextDouble();
             double c = sc.nextDouble();
        sc.close();

        double max = 0;

        if (b<=a && c<=a) {
            max = a;

        } else if (a<=b && c<= b) {
            max = b;
        } else  {
            max = c;
        }
        System.out.println("En büyük sayı "+max+"'dır.");


    }
}
