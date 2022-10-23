public class methods2 {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        //String yeniMesaj = mesaj.substring(0,3);
        //String yeniMesaj = add(); //Neden olamıyor çünkü boş döndürüyor
        String yeniMesaj = message(" gerçekten");
        System.out.println(yeniMesaj);
        int total = sum(5,8);
        System.out.println("Toplam: "+total);
        int total2 = sums(1,4,12,5,6,2);
        System.out.println("Sonuç: "+total2);
    }
    public static void add(){
        System.out.println("Eklendi...");
    }
    public static void update(){
        System.out.println("Güncellendi...");
    }
    public static void delete(){
        System.out.println("Silindi...");
    }
    public static String message(String yeniMesaj){
        return yeniMesaj;
    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sums(int...numbers){
        int total=0;
        for (int sayi:numbers){
            total+=sayi;
        }
        return total;
    }
}
