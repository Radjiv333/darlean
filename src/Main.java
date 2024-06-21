import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\tWelcome to the test! Please enter your number from 1 to 8, where:\n" +
                "1. Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел \n" +
                "2. Напишите программу для вывода нечетных чисел от 1 до 20 \n" +
                "3. Напишите программу, чтобы поменять местами две переменные \n" +
                "4. Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них \n" +
                "5. Напишите программу для проверки того, является ли число положительным или отрицательным \n" +
                "6. Напишите программу для замены всех символов 'a' на символы 'b' \n" +
                "7. Напишите программу для суммирования значений массива \n" +
                "8. Напишите программу для нахождения второго по величине числа из массива\n");
        Scanner scan = new Scanner(System.in);
        int testNumber = scan.nextInt();

        switch (testNumber)
        {
            case 1:
            {
                System.out.println("Первое число: ");
                double a = scan.nextDouble();
                System.out.println("Второе число: ");
                double b = scan.nextDouble();
                System.out.println("Оператор: ");
                char operator = scan.next().charAt(0);
                System.out.println("Результат: ");
                switch (operator)
                {
                    case '+':
                        System.out.println(a+b);
                        break;
                    case '-':
                        System.out.println(a-b);
                        break;
                    case '*':
                        System.out.println(a*b);
                        break;
                    case '/':
                        System.out.println(a/b);
                        break;
                }
                break;
            }
            case 2:
            {
                System.out.println("Результат: ");
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            }
            case 3:
            {
                System.out.println("Первое число: ");
                double a = scan.nextDouble();
                System.out.println("Второе число: ");
                double b = scan.nextDouble();
                double temp = b;
                b = a;
                a = temp;
                System.out.println("Результат: a: " + a + " b: " + b);
                break;
            }
            case 4:
            {

                System.out.println("Первое число: ");
                double a = scan.nextDouble();
                System.out.println("Второе число: ");
                double b = scan.nextDouble();
                System.out.println("Второе число: ");
                double c = scan.nextDouble();
                double[] arr = {a, b, c};
                double maxNumber = arr[0];

                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > maxNumber) {
                        maxNumber = arr[i];
                    }
                }
                System.out.println("Результат: " + maxNumber);
                break;
            }
            case 5:
            {
                System.out.println("Число: ");
                double a = scan.nextDouble();
                if (a > 0) System.out.println("Позитивное");
                else if (a < 0) System.out.println("Отрицательное");
                else System.out.println("Ноль");
                break;
            }
            case 6:
            {
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Введите текст: ");
                String str = scan2.nextLine();
                char[] ch = str.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] == 'a') {
                        ch[i] = 'b';
                    }
                }
                str = String.copyValueOf(ch);
                System.out.println("Результат: ");
                System.out.println(str);
                break;
            }
            case 7:
            {
                int[] arr = {1, 2, 3, 4, 5};
                int sum = 0;
                for (int el : arr) {
                    sum += el;
                }
                System.out.println(sum);
                break;
            }
            case 8:
            {
                int[] arr = {3, 5, 2, 6, 7, 8, 23, 11, 125, 5, 323};
                int max = 0;
                int previous_max = 0;
                for (int i = 0; i < arr.length; i++) {
                    previous_max = arr[i];
                    if (arr[i] > max) {
                        previous_max = max;
                        max = arr[i];
                    }
                }
                System.out.println(previous_max);
                break;
            }

        }

    }

}