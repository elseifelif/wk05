public class ComparePageNumbers extends Book{

    public ComparePageNumbers(String bookName, int numberofPages, String authorName, String publicationDate) {
        super(bookName, numberofPages, authorName, publicationDate);
    }

    @Override
    public int compareTo(Book book){
        return this.getNumberofPages()-book.getNumberofPages();
    }

}
