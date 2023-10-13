import java.util.*;

public class Main {

    public static void main (String [] args) {

        Set<Book> books = new TreeSet<Book>();
        books.add(new Book ("Zaman Makinesi",110,"Herbert George Wells"," 2020"));
        books.add(new Book ("Gurur ve Önyargı",400,"Jane Austen","2019"));
        books.add(new Book ("Beyaz Diş",200,"Jack London","2021"));
        books.add(new Book ("Hamlet",210,"William Shakespeare","2023"));
        books.add(new Book ("Dönüşüm",70,"Franz Kafka","2022"));

        // Kitap ismine göre sıralanmış liste
        System.out.println("Kitap ismine göre sıralanmış liste:");

       for (Book item : books) {
           System.out.println("İsim: " + item.getBookName() + " \t\tSayfa Sayısı: "+item.getNumberofPages()+
                   " \t\tYazar İsmi: "+item.getAuthorName());
       }
        System.out.println("______________________________________________");
        System.out.println("Sayfa sayısına göre sıralanmış liste:");
        Set<ComparePageNumbers> newBookList = new TreeSet<ComparePageNumbers>();

       for (Book item : books) {
           newBookList.add( new ComparePageNumbers(item.getBookName(),item.getNumberofPages(),
                   item.getAuthorName(), item.getPublicationDate()));
       }

       for (Book item : newBookList) {
           System.out.println("Sayfa Sayısı: "+item.getNumberofPages()+" \t\tİsim: "+item.getBookName()+
                   " \t\tYazar İsmi: "+item.getAuthorName());
       }

    }
}
