import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);

        int number = k.nextInt();
        int hours = k.nextInt();
        float amount = k.nextFloat();   
        float salary = hours * amount;

        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f%n",salary);

    }

}
