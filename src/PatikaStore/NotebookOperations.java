import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotebookOperations {

    HashMap<Integer, Notebook> notebookHashMap = new HashMap();
    Scanner scan = new Scanner(System.in);
    DecimalFormat decimalNumber = new DecimalFormat("##.#%");

    public void initialNotebookList() {
        Notebook notebook1 = new Notebook(10, 2000, 0.25, 40, "Notebook", "Brand1", "2 GB", "512 GB", "13 inç");
        Notebook notebook2 = new Notebook(11, 2500, 0.15, 40, "Notebook", "Brand2", "2 GB", "256 GB", "14 inç");
        Notebook notebook3 = new Notebook(12, 3000, 0.2, 40, "Notebook", "Brand2", "2 GB", "512 GB", "14 inç");

        notebookHashMap.put(notebook1.getUniqueProductNumber(), notebook1);
        notebookHashMap.put(notebook2.getUniqueProductNumber(), notebook2);
        notebookHashMap.put(notebook3.getUniqueProductNumber(), notebook3);

    }

    public void printNotebookList() {

        System.out.println("_________________________________________________________" +
                "________________________________________________________________________");
        System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s", "| Ürün No ", "| Fiyat ",
                "| İndirim Oranı", "| Stok", "| Ürün İsmi", "| Marka İsmi", "| Ram", "| Hafıza",
                "| Ekran |");
        System.out.println();
        System.out.println("_________________________________________________________" +
                "________________________________________________________________________");

        for (Map.Entry<Integer, Notebook> item : notebookHashMap.entrySet()) {
            System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s", "| " + item.getValue().getUniqueProductNumber(),
                    "| " + item.getValue().getProductPrice(), "| " + decimalNumber.format(item.getValue().getProductDiscountRate()),
                    "| " + item.getValue().getProductStock(), "| " + item.getValue().getProductName(),
                    "| " + item.getValue().getBrandName(), "| " + item.getValue().getRam(),
                    "| " + item.getValue().getNotebookStorage(), "| " + item.getValue().getNotebookScreen() + "| ");
            System.out.println();

        }

        System.out.println("_________________________________________________________" +
                "________________________________________________________________________");
    }

    public void addNotebook() {
        Notebook notebook = new Notebook(0, 0, 0, 0, "", "", "", "", "");

        System.out.println("Lütfen eklemek istediğiniz notebook ile ilgili özellikleri yazınız.");

        System.out.println("Ürün numarası:");
        int urunNo = scan.nextInt();
        notebook.setUniqueProductNumber(urunNo);

        System.out.println("Birim fiyatı");
        double productPrice = scan.nextDouble();
        notebook.setProductPrice(productPrice);

        System.out.println("İndirim Oranı:");
        double discountRate = scan.nextDouble();
        notebook.setProductDiscountRate(discountRate);

        System.out.println("Stok miktarı:");
        int stockNumber = scan.nextInt();
        notebook.setProductStock(stockNumber);
        scan.nextLine();

        System.out.println("Ürün adı:");
        String nameProduct = scan.nextLine();
        notebook.setProductName(nameProduct);

        System.out.println("Marka: ");
        String nameBrand = scan.nextLine();
        notebook.setBrandName(nameBrand);

        System.out.println("Hafıza: ");
        String memoryNotebook = scan.nextLine();
        notebook.setNotebookStorage(memoryNotebook);

        System.out.println("Ekran: ");
        String notebookScreen = scan.nextLine();
        notebook.setNotebookScreen(notebookScreen);

        System.out.println("Ram: ");
        String ramNotebook = scan.nextLine();
        notebook.setRam(ramNotebook);

        notebookHashMap.put(notebook.getUniqueProductNumber(), notebook);

    }

    public void notebookMenu() {
        while (true) {
            System.out.println("Lütfen seçim yapınız");
            System.out.println("1- Ürün Ekleme İşlemleri");
            System.out.println("2- Ürün Çıkarma İşlemleri");
            System.out.println("3- Ürünleri ID Numarasına Göre Filtrele");
            System.out.println("4- Ürünleri Markalarına Göre Filtrele");
            System.out.println("5- Ürün Yönetim Paneli");
            int x = scan.nextInt();

            switch (x) {
                case 1:
                    addNotebook();
                    printNotebookList();
                    break;
                case 2:
                    removeNotebook();
                    printNotebookList();
                    break;
                case 3:
                    filterbyNotebookID();
                    break;
                case 4:
                    filterbyNotebookBrand();
                    break;
                case 5:
                    return;
                default:
                    return;
            }
        }


    }

    public void removeNotebook() {
        System.out.println("Listedeki ürünlerin ID numaraları:");
        System.out.println(notebookHashMap.keySet());
        System.out.println("Lütfen çıkarmak istediğiniz ürünün ID numarasını yazınız.");
        int i = scan.nextInt();
        if (notebookHashMap.containsKey(i)) {
            notebookHashMap.remove(i);
        } else {
            System.out.println("Lütfen geçerli bir ID değeri yazınız.");
            removeNotebook();
        }


    }

    public void filterbyNotebookID() {
        printNotebookList();
        System.out.println("Lütfen filtrelemek istediğiniz ürünün ID numarasını yazınız.");
        int i = scan.nextInt();
        System.out.println("_________________________________________________________" +
                "________________________________________________________________________");
        System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s", "| Ürün No ", "| Fiyat ",
                "| İndirim Oranı", "| Stok", "| Ürün İsmi", "| Marka İsmi", "| Ram", "| Hafıza",
                "| Ekran |");
        System.out.println();
        System.out.println("_________________________________________________________" +
                "________________________________________________________________________");

        System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s", "| "
                        + notebookHashMap.get(i).getUniqueProductNumber(),
                "| " + notebookHashMap.get(i).getProductPrice(), "| "
                        + decimalNumber.format(notebookHashMap.get(i).getProductDiscountRate()),
                "| " + notebookHashMap.get(i).getProductStock(), "| " + notebookHashMap.get(i).getProductName(),
                "| " + notebookHashMap.get(i).getBrandName(), "| " + notebookHashMap.get(i).getRam(),
                "| " + notebookHashMap.get(i).getNotebookStorage(), "| " + notebookHashMap.get(i).getNotebookScreen() + "| ");
        System.out.println();

    }

    public void filterbyNotebookBrand() {
        printNotebookList();
        System.out.println("Lütfen filtrelemek istediğiniz marka ismini yazınız.");
        String brand = scan.next();
        System.out.println();
        System.out.println("_________________________________________________________" +
                "________________________________________________________________________");
        System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s", "| Ürün No ", "| Fiyat ",
                "| İndirim Oranı", "| Stok", "| Ürün İsmi", "| Marka İsmi", "| Ram", "| Hafıza",
                "| Ekran |");
        System.out.println();
        System.out.println("_________________________________________________________" +
                "________________________________________________________________________");
        for (Map.Entry<Integer, Notebook> item : notebookHashMap.entrySet()) {
            if (item.getValue().getBrandName().equalsIgnoreCase(brand)) {
                System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s", "| "
                                + item.getValue().getUniqueProductNumber(),
                        "| " + item.getValue().getProductPrice(), "| "
                                + decimalNumber.format(item.getValue().getProductDiscountRate()),
                        "| " + item.getValue().getProductStock(), "| " + item.getValue().getProductName(),
                        "| " + item.getValue().getBrandName(), "| " + item.getValue().getRam(),
                        "| " + item.getValue().getNotebookStorage(), "| " + item.getValue().getNotebookScreen() + "| ");
                System.out.println();
            }

        }
        System.out.println("_________________________________________________________" +
                "________________________________________________________________________");


    }


}

