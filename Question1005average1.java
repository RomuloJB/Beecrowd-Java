import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double grade1 = sc.nextDouble();
        double grade2 = sc.nextDouble();

        double media = ((grade1*3.5) + (grade2*7.5))/11;

        System.out.printf("MEDIA = %.5f%n", media);
        sc.close();
    }
}
