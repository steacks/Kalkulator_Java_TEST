import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    while (true){
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        if (operator == 's') {
            break;
        }

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: некорректная операция!");
                return;
        }

        System.out.println("Результат: " + result);
        }
        scanner.close();
        
    }
}