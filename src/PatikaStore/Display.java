import java.util.ArrayList;
import java.util.Scanner;

public class Display {

    Scanner scan = new Scanner(System.in);
    MobilePhoneOperations mobilePhoneOperations = new MobilePhoneOperations();
    NotebookOperations notebookOperations = new NotebookOperations();
    ArrayList<Notebook> notebookArrayList = new ArrayList<Notebook>();

    public void run () {
        notebookOperations.initialNotebookList();
        mobilePhoneOperations.initialMobilePhoneList();

        while (true) {

            System.out.println("PatikaStore Ürün Yönetim Paneli");
            System.out.println("1- Notebook İşlemleri");
            System.out.println("2- Cep Telefonu İşlemleri");
            System.out.println("3- Markaları Listele");
            System.out.println("0- Çıkış Yap");
            System.out.println("Lütfen bir seçim yapınız.");

            int select = scan.nextInt();

            switch (select) {
                case 1:
                    notebookOperations.printNotebookList();
                    notebookOperations.notebookMenu();
                    break;
                case 2:

                    mobilePhoneOperations.printMobilePhoneList();
                    mobilePhoneOperations.mobilePhoneMenu();

                    break;
                case 3:
                    Brand.displayBrands();
                    break;
                case 0:
                    return;
                default:
                    break;
            }

        }


    }
}
