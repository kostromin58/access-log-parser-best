import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите первое число: ");
        int number2 = new Scanner(System.in).nextInt();

        int firstNumber = 5;
        int secondNumber = 10;
        int addition = firstNumber + secondNumber;
        System.out.println("Сумма: " + addition);
        int subtraction = firstNumber - secondNumber;
        System.out.println("Вычитание: " + subtraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println("Умножение: " + multiplication);
        double division = (double) firstNumber / secondNumber;
        System.out.println("Деление: " + division);

    }
}