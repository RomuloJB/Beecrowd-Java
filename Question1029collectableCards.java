import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rest;

        for (int i = 1; i <= n; i++){
            int f1 = sc.nextInt();
            int f2 = sc.nextInt();

            if (f1 > f2){
                while (f2 != 0) {
                    rest = f1 % f2;
                    f1 = f2;
                    f2 = rest;
                }
                System.out.println(f1);
            }

            if (f2 > f1){
                while(f1 != 0){
                    rest = f2 % f1;
                    f2 = f1;
                    f1 = rest;
                }
                System.out.println(f2);
            }
        }
    }
}
