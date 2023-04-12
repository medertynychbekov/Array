import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Бул жерде рандомдон сан алып жатам

        Random random = new Random();

        for (; ; ) {
            System.out.println("Какой этаж?:");
            int etaj = scanner.nextInt();
            if (etaj > 100) {
                for (; ; ) {
                    System.out.println("такого этажа нет " + etaj + "\n Вам на какой этаж от 1 до 100");
                    etaj = scanner.nextInt();
                    if (etaj <= 100) {
                        break;
                    }
                }
            }

            if (etaj == 0) {
                break;
            }
            System.out.println("Какой вес?:");
            int kg = scanner.nextInt();

            if (kg > 200) {
                for (; ; ) {
                    System.out.println("большой вес: " + kg + "kg\n Пожалуйста уменьшите вес до 200kg");
                    kg = scanner.nextInt();
                    if (kg <= 200) {
                        break;
                    }
                }
            }

            if (kg == 0) {
                break;
            }

            int ranSan = random.nextInt(3);
            if (ranSan == 1) {
                int bul = 1;
                int percent = (etaj * 30) / 100;
                for (int i = 1; i <= percent; i++) {
                    System.out.println("Вы находитесь на #" + i + " этаже");
                    bul++;
                }
                System.out.println("Лтфт застрял между " + percent + " и " + bul + " этажами");
            } else {
                for (int i = 1; i <= etaj; i++) {
                    System.out.println("Вы находитесь на #" + i + " этаже");
                }
            }
        }

    }
}