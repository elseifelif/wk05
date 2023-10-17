public class Notebook extends Product{

    private String ram;
    private String notebookStorage;
    private String notebookScreen;

    public Notebook(int uniqueProductNumber, double productPrice,
                    double productDiscountRate, int productStock,
                    String productName, String brandName, String ram,
                    String notebookStorage, String notebookScreen) {

        super(uniqueProductNumber, productPrice, productDiscountRate,
                productStock, productName, brandName);
        this.ram = ram;
        this.notebookStorage = notebookStorage;
        this.notebookScreen = notebookScreen;

    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getNotebookStorage() {
        return notebookStorage;
    }

    public void setNotebookStorage(String notebookStorage) {
        this.notebookStorage = notebookStorage;
    }

    public String getNotebookScreen() {
        return notebookScreen;
    }

    public void setNotebookScreen(String notebookScreen) {
        this.notebookScreen = notebookScreen;
    }
}
