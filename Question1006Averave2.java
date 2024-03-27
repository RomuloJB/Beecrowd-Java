import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);

        /*
         * Read three values (variables A, B and C), which are the three student's
         * grades. Then, calculate the average, considering that grade A has weight 2,
         * grade B has weight 3 and the grade C has weight 5. Consider that each grade
         * can go from 0 to 10.0, always with one decimal place.
         * 
         * Input
         * The input file contains 3 values of floating points (double) with one digit
         * after the decimal point.
         * 
         * Output
         * Print the message "MEDIA"(average in Portuguese) and the student's average
         * according to the following example, with a blank space before and after the
         * equal signal.
         */

        double A = k.nextDouble();
        double B = k.nextDouble();
        double C = k.nextDouble();

        double grade1 = A*2;
        double grade2 = B*3;
        double grade3 = C*5;

        double MEDIA = (grade1+grade2+grade3)/10;

        System.out.printf("MEDIA = %.1f%n",MEDIA);


    }

}
