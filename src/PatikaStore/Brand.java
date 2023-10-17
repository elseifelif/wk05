import java.util.ArrayList;
import java.util.Collections;

public class Brand implements Comparable<Brand> {
    private int brandID;
    private String brandName;

    public Brand(int brandID, String brandName) {
        this.brandID = brandID;
        this.brandName = brandName;
    }

    static ArrayList<Brand> brandArrayList = new ArrayList<Brand>();

    static {
        brandArrayList.add(new Brand(1, "Samsung"));
        brandArrayList.add(new Brand(2, "Lenovo"));
        brandArrayList.add(new Brand(3, "Apple"));
        brandArrayList.add(new Brand(4, "Huawei"));
        brandArrayList.add(new Brand(5, "Casper"));
        brandArrayList.add(new Brand(6, "Asus"));
        brandArrayList.add(new Brand(7, "HP"));
        brandArrayList.add(new Brand(8, "Xiaomi"));
        brandArrayList.add(new Brand(9, "Monster"));

    }


    public static void displayBrands() {
        Collections.sort(brandArrayList);
        Collections.reverse(brandArrayList);

        System.out.println("Markalar:");
        for (Brand item : brandArrayList) {
            System.out.println("* " + item.getBrandName());
        }
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


   @Override
    public int compareTo(Brand brand) {
        return this.getBrandName().compareTo(brand.getBrandName());
    }
}
