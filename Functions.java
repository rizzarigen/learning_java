import java.util.Scanner;
import java.lang.Math;



public class Functions {
    
    public static double peri(int n, int R) {
        double degrad = (180 / n) * (3.14 / 180);
        double a = 2 * R * Math.sin(degrad);
        return a;
    }
    public static void main(String[] var0) {
        
        Scanner scanner = new Scanner(System.in, "UTF-8");
        
        System.out.println("Введите радиус круга");
        
        int rad = scanner.nextInt();

        System.out.println("Периметр 10-тиугольника: " + peri(10, rad));
        System.out.println("Периметр 50-тиугольника: " + peri(50, rad));
        System.out.println("Периметр 100-тиугольника: " + peri(100, rad));
    }
}
