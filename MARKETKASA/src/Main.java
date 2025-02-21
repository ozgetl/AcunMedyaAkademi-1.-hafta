import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double toplamTutar = 0;
        boolean indirimUygula = false;
    while (true) {
    System.out.println("Ürün seçiniz:\n1. Elma -20 TL\n2. Muz - 30 TL\n3. Portakal - 25 TL\n0. Alışvverişi bitir");
    int secim = scanner.nextInt();
    switch (secim) {
        case 1:
            toplamTutar += 20;
    break;
        case 2:
            toplamTutar += 30;
            break;
        case 3:
            toplamTutar += 25;
            break;
        case 0:
            System.out.println("İndirim kuponunuz var mı?(Evet için 1, Hayır için 0)");
            int kupon = scanner.nextInt();
            if (kupon == 1){
                indirimUygula = true;
            }
            if (indirimUygula) {
                toplamTutar *= 0.9; // %10 indirim uygulanıyor
            }
            System.out.println("Toplam Tutar: " + toplamTutar +" TL");
            scanner.close();
            return;
        default:
            System.out.println("Geçersiz seçim, tekrar deneyin.");
    }
    }
    }
}