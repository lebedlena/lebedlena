import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Это программа для сложения трёх чисел.");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введи первое число и нажми ENTER");
        int a = scan.nextInt();
        System.out.println("Введи второе число и нажми ENTER");
        int b = scan.nextInt();
        System.out.println("Введи третье число и нажми ENTER");
        int c = scan.nextInt();
        System.out.println("Твоя сумма:");
        System.out.println(a+b+c);
    }

}
