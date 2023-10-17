import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MobilePhoneOperations {


    HashMap<Integer,MobilePhone> mobilePhoneHashMap = new HashMap();
    Scanner scan = new Scanner(System.in);
    DecimalFormat decimalNumber = new DecimalFormat("##.#%");

    public void initialMobilePhoneList () {

        MobilePhone mobilePhone1 = new MobilePhone(111,3000,0.35,2,"Cep Telefonu","brand1","","","","","Siyah");
        MobilePhone mobilePhone2 = new MobilePhone(222,2000,0.3,2,"Cep Telefonu","brand2","","","","","Gri");
        MobilePhone mobilePhone3 = new MobilePhone(333,2500,0.25,2,"Cep Telefonu","brand1","","","","","Siyah");
        MobilePhone mobilePhone4 = new MobilePhone(444,3500,0.4,2,"Cep Telefonu","","","","","","Gri");

        mobilePhoneHashMap.put(mobilePhone1.getUniqueProductNumber(),mobilePhone1);
        mobilePhoneHashMap.put(mobilePhone2.getUniqueProductNumber(),mobilePhone2);
        mobilePhoneHashMap.put(mobilePhone3.getUniqueProductNumber(),mobilePhone3);
        mobilePhoneHashMap.put(mobilePhone4.getUniqueProductNumber(),mobilePhone4);
    }

    public void printMobilePhoneList () {

        System.out.println("___________________________________________________________________" +
                "________________________________________________________________________________");
        System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s %-10s %-14s","| Ürün No ","| Fiyat ",
                "| İndirim Oranı", "| Stok","| Ürün İsmi", "| Marka İsmi","| Hafıza","| Ekran",
                "| Pil Gücü","| Ram","| Renk |");
        System.out.println();
        System.out.println("___________________________________________________________________" +
                "________________________________________________________________________________");

        for (Map.Entry <Integer,MobilePhone> item : mobilePhoneHashMap.entrySet()) {
            System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s %-10s %-14s","| "+item.getValue().getUniqueProductNumber(),
                    "| "+item.getValue().getProductPrice(),"| "+decimalNumber.format(item.getValue().getProductDiscountRate()),
                    "| "+item.getValue().getProductStock(),"| " +item.getValue().getProductName(),
                    "| "+item.getValue().getBrandName(),"| "+item.getValue().getMemory(),
                    "| "+item.getValue().getMobilePhoneScreen(),"| "+item.getValue().getBatteryPower(),
                    "| "+item.getValue().getRam(),"| "+item.getValue().getColor()+"|");
            System.out.println();

        }

        System.out.println("___________________________________________________________________" +
                "________________________________________________________________________________");
    }
    public void addMobilePhone () {
        MobilePhone mobilePhone = new MobilePhone(0,0,0,0,"","","","","","","");

        System.out.println("Lütfen eklemek istediğiniz cep telefonuyla ilgili özellikleri yazınız.");
        System.out.println("Ürün numarası:");
        int urunNo = scan.nextInt();
        mobilePhone.setUniqueProductNumber(urunNo);

        System.out.println("Birim fiyatı");
        double productPrice = scan.nextDouble();
        mobilePhone.setProductPrice(productPrice);

        System.out.println("İndirim Oranı:");
        double discountRate= scan.nextDouble();
        mobilePhone.setProductDiscountRate(discountRate);

        System.out.println("Stok miktarı:");
        int stockNumber = scan.nextInt();
        mobilePhone.setProductStock(stockNumber);
        scan.nextLine();

        System.out.println("Ürün adı:");
        String nameProduct = scan.nextLine();
        mobilePhone.setProductName(nameProduct);


        System.out.println("Marka: ");
        String nameBrand = scan.nextLine();
        mobilePhone.setBrandName(nameBrand);

        System.out.println("Hafıza: ");
        String memoryMobilePhone = scan.nextLine();
        mobilePhone.setMemory(memoryMobilePhone);

        System.out.println("Ekran: ");
        String mobilePhoneScreen = scan.nextLine();
        mobilePhone.setMobilePhoneScreen(mobilePhoneScreen);

        System.out.println("Pil Gücü: ");
        String batteryPowerMobilePhone = scan.nextLine();
        mobilePhone.setBatteryPower(batteryPowerMobilePhone);

        System.out.println("Ram: ");
        String ramMobilePhone = scan.nextLine();
        mobilePhone.setRam(ramMobilePhone);

        System.out.println("Renk: ");
        String colorMobilePhone = scan.nextLine();
        mobilePhone.setColor(colorMobilePhone);

        mobilePhoneHashMap.put(mobilePhone.getUniqueProductNumber(),mobilePhone);
    }

    public void mobilePhoneMenu () {
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
                    addMobilePhone();
                    printMobilePhoneList();
                    break;
                case 2:
                    removeMobilePhone();
                    printMobilePhoneList();
                    break;
                case 3:
                    filterMobilePhonebyID();
                    break;
                case 4:
                    filterMobilePhonebyBrand();
                    break;
                case 5:
                    return;
                default:
                    return;
            }
        }
    }

    public void removeMobilePhone () {
        System.out.println(mobilePhoneHashMap.keySet());
        System.out.println("Lütfen çıkarmak istediğiniz ürünün ID numarasını yazınız.");
        int i = scan.nextInt();
        if (mobilePhoneHashMap.containsKey(i)) {
            mobilePhoneHashMap.remove(i);
        } else {
            System.out.println("Lütfen geçerli bir ID değeri yazınız.");
            removeMobilePhone();
        }

    }

    public void filterMobilePhonebyID () {
        printMobilePhoneList();
        System.out.println("Lütfen filtrelemek istediğiniz ürünün ID numarasını yazınız.");
        int j = scan.nextInt();

        System.out.println("___________________________________________________________________" +
                "________________________________________________________________________________");
        System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s %-15s %-14s","| Ürün No ","| Fiyat ",
                "| İndirim Oranı", "| Stok","| Ürün İsmi", "| Marka İsmi","| Hafıza","| Ekran",
                "| Pil Gücü","| Ram","| Renk |");
        System.out.println();
        System.out.println("___________________________________________________________________" +
                "________________________________________________________________________________");

        System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s %-15s %-14s","| "+mobilePhoneHashMap.get(j).getUniqueProductNumber(),
                "| "+mobilePhoneHashMap.get(j).getProductPrice(),"| "+decimalNumber.format(mobilePhoneHashMap.get(j).getProductDiscountRate()),
                "| "+mobilePhoneHashMap.get(j).getProductStock(),"| " +mobilePhoneHashMap.get(j).getProductName(),
                "| "+mobilePhoneHashMap.get(j).getBrandName(),"| "+mobilePhoneHashMap.get(j).getMemory(),
                "| "+mobilePhoneHashMap.get(j).getMobilePhoneScreen(),"| "+mobilePhoneHashMap.get(j).getBatteryPower(),
                "| "+mobilePhoneHashMap.get(j).getRam(),"| "+mobilePhoneHashMap.get(j).getColor()+"|");
        System.out.println();
        System.out.println("___________________________________________________________________" +
                "________________________________________________________________________________");
    }

    public void filterMobilePhonebyBrand () {
        printMobilePhoneList();
        System.out.println("Lütfen filtrelemek istediğiniz marka ismini yazınız.");
        String brand = scan.next();
        System.out.println("___________________________________________________________________" +
                "________________________________________________________________________________");
        System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s %-10s %-14s","| Ürün No ","| Fiyat ",
                "| İndirim Oranı", "| Stok","| Ürün İsmi", "| Marka İsmi","| Hafıza","| Ekran",
                "| Pil Gücü","| Ram","| Renk |");
        System.out.println();
        System.out.println("___________________________________________________________________" +
                "________________________________________________________________________________");
        for (Map.Entry<Integer,MobilePhone> item : mobilePhoneHashMap.entrySet()) {
            if (item.getValue().getBrandName().equalsIgnoreCase(brand)) {
                System.out.format("%-12s %-10s %-15s %-10s %-14s %-18s %-12s %-12s %-12s %-10s %-14s","| "+item.getValue().getUniqueProductNumber(),
                        "| "+item.getValue().getProductPrice(),"| "+decimalNumber.format(item.getValue().getProductDiscountRate()),
                        "| "+item.getValue().getProductStock(),"| " +item.getValue().getProductName(),
                        "| "+item.getValue().getBrandName(),"| "+item.getValue().getMemory(),
                        "| "+item.getValue().getMobilePhoneScreen(),"| "+item.getValue().getBatteryPower(),
                        "| "+item.getValue().getRam(),"| "+item.getValue().getColor()+"|");
                System.out.println();
            }
        }
        System.out.println("___________________________________________________________________" +
                "________________________________________________________________________________");
    }
}
