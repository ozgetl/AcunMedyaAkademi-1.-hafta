import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int pin = 1234;
        boolean isAuthenticated = false;

        System.out.print("PIN kodunu girin: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin == pin) {
            isAuthenticated = true;
            while (true) {
                System.out.println("\nATM Menü:");
                System.out.println("1. Bakiye Görüntüleme");
                System.out.println("2. Para Yatırma");
                System.out.println("3. Para Çekme");
                System.out.println("4. Çıkış");
                System.out.print("Seçiminizi yapın: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Bakiyeniz: " + balance + " TL");
                        break;
                    case 2:
                        System.out.print("Yatırılacak miktarı girin: ");
                        int deposit = scanner.nextInt();
                        balance += deposit;
                        System.out.println("Yeni bakiyeniz: " + balance + " TL");
                        break;
                    case 3:
                        System.out.print("Çekilecek miktarı girin: ");
                        int withdraw = scanner.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Yetersiz bakiye!");
                        } else {
                            balance -= withdraw;
                            System.out.println("Yeni bakiyeniz: " + balance + " TL");
                        }
                        break;
                    case 4:
                        System.out.println("Çıkış yapılıyor...");
                        return;
                    default:
                        System.out.println("Geçersiz seçim!");
                }
            }
        } else {
            System.out.println("Hatalı PIN!");
        }
        scanner.close();
    }
}

