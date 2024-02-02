import java.util.*;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1 , sayi2 , select;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        sayi2 = input.nextInt();

        System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
        System.out.print("Seçiminizi yapınız : ");
select= input.nextInt();

    if (select==1){
    System.out.println("Toplama : " + (sayi1 + sayi2));
    
    }else if (select == 2){
    System.out.println("Çıkarma : " + (sayi1 - sayi2));
        } else if (select == 3) {
        System.out.println("Çarpma : " + (sayi1 * sayi2));
} else if (select == 4 ){

        if (sayi2 != 0){
            System.out.println("Bölme : " + (double) sayi1 / sayi2);
        }else {
            System.out.println("Bir sayı 0'a bölünemez.");

        }

    }else {
        System.out.println("Yanlış seçim yaptınız. Tekrar Deneyiniz.");
    }
}

    }

