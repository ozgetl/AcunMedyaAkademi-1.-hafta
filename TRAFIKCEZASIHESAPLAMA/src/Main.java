import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen hızınızı giriniz (km/s): ");
        int speed = scanner.nextInt();

        if (speed > 130) {
            System.out.println("Ehliyetinize el konuldu!");
        } else if (speed > 110) {
            System.out.println("Cezanız: 2000 TL");
        } else if (speed > 90) {
            System.out.println("Cezanız: 1000 TL");
        } else {
            System.out.println("Hız sınırı içinde, iyi yolculuklar!");
        }

        scanner.close();
    }
}
