public class Methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] numbers = new int[] {1,4,6,12,66,3};
        int aranacakSayi = 5;
        boolean varMi = false;
        for (int number : numbers){
            if (number==aranacakSayi){
                varMi = true;
                System.out.println("Sayı var");
                break;
            }
        }
        if(varMi){
            mesajVer(aranacakSayi);
        }
        else {
            System.out.println("Sayı yok");
        }

    }
    public static void mesajVer(int aranacakSayi){
        System.out.println("Sayı: "+aranacakSayi);
    }
}
