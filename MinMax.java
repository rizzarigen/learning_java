import java.util.Scanner;
import java.io.Console;
import java.lang.Math;


public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int x;
        int y;
        int a;
        int b;
        double z;

        System.out.println("Введите x: "); //ввод х
        x = scanner.nextInt();
        System.out.println("Введите y: ");
        y = scanner.nextInt();
        System.out.println("Введите a: ");
        a = scanner.nextInt();
        System.out.println("Введите b: ");
        b = scanner.nextInt();

        if (x < y)
        {
            double minEl = a - Math.cos(x);
            if (a / (b + y) < minEl)
            {
                minEl = a / (b + y);
            }
            if (Math.pow(Math.sin(y), 2) < minEl) //проверка 
            {
                minEl = Math.pow(Math.sin(y), 2);
            }
            z = minEl;
            System.out.println("Результат: " + z);
        }
        else if (y <= x && x < y + 5)
        {
            double maxEl = Math.pow(a, 3);

            if (maxEl < Math.log(Math.pow(x, 2) + Math.pow(y, 2)))
            {
                maxEl = Math.log(Math.pow(x, 2) + Math.pow(y, 2));
            }
            z = maxEl;
            System.out.println("Результат: " + z);

        }
        else if (x >= y + 5)
        {
            z = a + Math.pow(Math.cos(x - y), 3);
            System.out.println("Результат: " + z);
                }
        scanner.close();
    }

}
