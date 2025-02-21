import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] notlar = new int[5];
        int toplam = 0;
        int enYuksek = Integer.MIN_VALUE;
        int enDusuk = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". ders notunu giriniz: ");
            notlar[i] =scanner.nextInt();
            toplam += notlar[i];

            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
            if (notlar[i] < enDusuk) {
                enDusuk = notlar[i];
            }
        }

        double ortalama = toplam / 5.0;
        System.out.println("Ortalama: " + ortalama);
        System.out.println(ortalama >= 50 ? "Geçtiniz!" : "Kaldınız!");

        for (int not : notlar) {
            if (not < 30) {
                System.out.println("Düşük notlarınız var!");
                break;
            }
        }

        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("En düşük not: " + enDusuk);

        scanner.close();
    }
}