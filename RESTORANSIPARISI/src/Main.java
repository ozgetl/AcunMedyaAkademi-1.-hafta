import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplamTutar = 0;
        boolean devam = true;

        do {
            System.out.println("\nMenü:");
            System.out.println("1. Hamburger - 50 TL");
            System.out.println("2. Pizza - 80 TL");
            System.out.println("3. Salata - 30 TL");
            System.out.println("0. Siparişi Tamamla");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplamTutar += 50;
                    break;
                case 2:
                    toplamTutar += 80;
                    break;
                case 3:
                    toplamTutar += 30;
                    break;
                case 0:
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }
        } while (devam);

        System.out.println("Toplam sipariş tutarınız: " + toplamTutar + " TL");
        scanner.close();
    }
}
