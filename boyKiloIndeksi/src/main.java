import java.util.Scanner;

public class main {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen boyunuzu m cinsinden giriniz.(1,76)");
        double height= sc.nextDouble();
        System.out.println("Lütfen Kilonuzu 'x,xx' (87,5) şeklinde giriniz.");
        double weight= sc.nextDouble();
        sc.close();
        double bodyIndex = weight/(height*height);
        System.out.println("Vücut kitle edneksiniz:"+ bodyIndex +"BMI'dır." );



    }
}
