import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageDays = sc.nextInt();

        int years = ageDays/365;
        ageDays%=365;

        int months = ageDays/30;
        ageDays%=30;

        int days = ageDays;

        System.out.println(years+" ano(s)");
        System.out.println(months+" mes(es)");
        System.out.println(days+" dia(s)");
        
    }
}
