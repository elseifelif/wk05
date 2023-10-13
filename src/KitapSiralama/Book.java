public class Book implements Comparable <Book> {

    String bookName;
    int numberofPages;
    String authorName;
    String publicationDate;


    public Book(String bookName, int numberofPages, String authorName, String publicationDate) {
        this.bookName = bookName;
        this.numberofPages = numberofPages;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberofPages() {
        return numberofPages;
    }

    public void setNumberofPages(int numberofPages) {
        this.numberofPages = numberofPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Book book) {

        return this.getBookName().compareTo(book.getBookName());
    }
}
