import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double tri = (a*c)/2;
        double cir = 3.14159 * Math.pow(c, 2);
        double tra = ((a+b)*c)/2;
        double squ = b*b;
        double rec = a*b;

        System.out.printf("TRIANGULO: %.3f%n", tri);
        System.out.printf("CIRCULO: %.3f%n", cir);
        System.out.printf("TRAPEZIO: %.3f%n", tra);
        System.out.printf("QUADRADO: %.3f%n", squ);
        System.out.printf("RETANGULO: %.3f%n", rec);
    }
}
