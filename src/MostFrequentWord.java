import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentWord {
    public static void main (String[] args) {
        System.out.println("Lütfen bir metin yazınız.");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String [] textArray = text.split(" ");

        HashMap<String,Integer> textHashMap = new HashMap<String,Integer>();
        int numberofWords;

        for (String item: textArray) {
            if (textHashMap.containsKey(item)) {
                Integer value = textHashMap.get(item);
                textHashMap.replace(item,value+1);
            } else {
                numberofWords =1;
                textHashMap.put(item,numberofWords);

            }
        }

        int frequency =0;
        String mostFrequentWord="";
        for (String item: textArray) {
            if (textHashMap.get(item)>frequency) {
                frequency=textHashMap.get(item);
                mostFrequentWord =item;
            }
        }

      
        System.out.println("Yazıda en çok tekrar eden kelime: "+mostFrequentWord+
                ", kelimenin tekrar sayısı: "+frequency);

    }
}
