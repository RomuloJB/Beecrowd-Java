import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);

         int A = k.nextInt();
         int B = k.nextInt();
         int C = k.nextInt();
         int D = k.nextInt();

         int DIFERENCA = (A * B - C * D);

         System.out.println("DIFERENCA = "+DIFERENCA);
    }

}
