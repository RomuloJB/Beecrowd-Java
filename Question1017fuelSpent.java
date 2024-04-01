import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int timeSpent = sc.nextInt();
    int speedAverage = sc.nextInt();
    double distance = timeSpent * speedAverage;

    double litersSpent = distance/12;

    System.out.printf("%.3f%n", litersSpent);
    
    }

}
