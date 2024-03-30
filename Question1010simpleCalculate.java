import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int uni1 = sc.nextInt();
        double val1 = sc.nextDouble();
        double pag1 = val1*uni1;

        int cod2 = sc.nextInt();
        int uni2 = sc.nextInt();
        double val2 = sc.nextDouble();
        double pag2 = val2*uni2;

        double total = pag1 + pag2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
    }
}
