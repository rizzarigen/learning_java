import java.util.Scanner;
import java.io.Console;
import java.lang.Math;


public class MathBasics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Введите х: ");
        int x = scanner.nextInt();
        System.out.print("Введите y: ");
        int y = scanner.nextInt();

        double f = (((Math.PI / 3) + Math.log(x ^ 3)) / (3 * y - x)) + (x * Math.sin(y ^ 2));

        double i = f;
        double j = Math.floor(f);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
