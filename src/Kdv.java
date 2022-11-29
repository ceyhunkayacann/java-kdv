import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double fiyat;
        double kdv;
        double toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat Giriniz : ");
        fiyat = input.nextInt();

        //kdv = fiyat * 0.18;
        kdv = (fiyat > 0 && fiyat <= 1000 ? 0.18 : 0.08) * fiyat;

        toplam = fiyat + kdv;

        System.out.println("KDV'siz tutar : " + fiyat);
        System.out.println("KDV'li tutar : " + toplam);
        System.out.println("KDV tutarı : " + kdv);
    }
}
