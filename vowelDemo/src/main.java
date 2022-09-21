
import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        char [] vowels = new char[16];
        vowels[0]='a';
        vowels[1]='e';
        vowels[2]='ı';
        vowels[3]='i';
        vowels[4]='u';
        vowels[5]='ü';
        vowels[6]='o';
        vowels[7]='ö';
        vowels[8]='A';
        vowels[9]='E';
        vowels[10]='I';
        vowels[11]='İ';
        vowels[12]='U';
        vowels[13]='Ü';
        vowels[14]='O';
        vowels[15]='Ö';


        Scanner sc = new Scanner(System.in);
        System.out.println("Hoş geldiniz");
        System.out.println("Lütfen işlem yapmak istediğiniz harfi giriniz");
        System.out.println("Sistemimiz BÜYÜK/küçük harf duyarlılığına sahip değildir.");
        boolean isVowel=false;

        char input= sc.next().charAt(0);

      // if(Character.compare(input,vowels[])==0){
        //    System.out.println("harf seslidir");
       // }



        for(char i:vowels){

            if(i==input){
                isVowel=true;
                break;
            } else {
                isVowel= false;
            }

        }

        if (isVowel){
            System.out.println("'"+input+"'" + " sesli harftir. ");
        }else {
            System.out.println("'"+input+"'" + " sesli harf değildir.");
        }



    }
}
