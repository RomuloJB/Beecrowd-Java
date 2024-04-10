import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int hours = x / 3600;
        x%=3600;
        int minutes = x / 60;
        x%=60;
        int seconds = x;

        System.out.println(hours+":"+minutes+":"+seconds);
    }
}
