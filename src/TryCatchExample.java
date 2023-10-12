import java.util.Arrays;
import java.util.Scanner;

public class TryCatchExample {
    public static void main (String [] args) {
        tryCatchMethod();
    }

    public static void tryCatchMethod () {
        Scanner scan = new Scanner(System.in);
        int [] numbers = {25,8,35,26,70,92,73,14,3,48};
        System.out.println("Sayı dizisi: "+ Arrays.toString(numbers));
        System.out.println("Lütfen 0 ve 9 arasında bir sayı yazınız.");
        int input;
        try {
            input = scan.nextInt();
            System.out.println("Dizideki "+(input)+" nolu değer: "+numbers[input]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bir hata oluştu: "+e);
            System.out.println("Lütfen 0 ve 9 arasında bir sayı yazınız.");
            input = scan.nextInt();
            System.out.println("Dizideki "+(input)+" nolu değer: "+numbers[input]);
        }
    }
}
