public abstract class Product {
    private int uniqueProductNumber;
    private double productPrice;
    private double productDiscountRate;
    private int productStock;
    private String productName;
    private String brandName;

    public Product(int uniqueProductNumber, double productPrice,
                   double productDiscountRate, int productStock,
                   String productName, String brandName) {
        this.uniqueProductNumber = uniqueProductNumber;
        this.productPrice = productPrice;
        this.productDiscountRate = productDiscountRate;
        this.productStock = productStock;
        this.productName = productName;
        this.brandName = brandName;
    }

    public int getUniqueProductNumber() {
        return uniqueProductNumber;
    }

    public void setUniqueProductNumber(int uniqueProductNumber) {
        this.uniqueProductNumber = uniqueProductNumber;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductDiscountRate() {
        return productDiscountRate;
    }

    public void setProductDiscountRate(double productDiscountRate) {
        this.productDiscountRate = productDiscountRate;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
