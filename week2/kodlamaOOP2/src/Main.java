public class Main {
    public static void main(String[] args) {
        //CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager;
        CustomerManager customerManager1 = new CustomerManager();
        customerManager=customerManager1;
        customerManager.add();
        customerManager.update();
        customerManager.delete();

        //values
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1=30;
        System.out.println(sayi2);
        //primitive yapılar stackte eşleşir o yüzden farklı bir değere atanmaz.

        int[] sayilar = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2=sayilar;
        sayilar[0]=10;
        System.out.println(sayilar2[0]);

    }
}
