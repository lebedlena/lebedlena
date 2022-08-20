import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Угадай однозначное число!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введи число и нажми ENTER");
        int a = 7;
        int b = scan.nextInt();
        if (a<b) System.out.println("Не верно. Загаданное число меньше.");

        else if (a>b) System.out.println("Попробуй ещё раз. Загаданное число больше.");

        else System.out.println("Bingo! Поздравляю! Задание выполнено!");
    }
}