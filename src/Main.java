

import java.util.Scanner;
    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ввод первого числа ");
            int a = scanner.nextInt();
            System.out.println(a + " пишем первое число ");
            System.out.println(" пишем второе число ");
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println(+c);
        }
    }
