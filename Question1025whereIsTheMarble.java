import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        
        while (true) {
        	cont++;
        	int nMarbles = sc.nextInt();
        	int qMeenas = sc.nextInt();
        	
        	if (nMarbles == 0 && qMeenas == 0) {
        		break;
        	} 
        	
        	int n[] = new int[nMarbles];
        	
        	for (int i = 0; i < nMarbles; i++) {
        		n[i] = sc.nextInt();
        	}
        	
        	int q[] = new int[qMeenas];
        	for (int i = 0; i < qMeenas; i++) {
        		int teste = sc.nextInt();
        		q[i] = teste;
        	}
        	Arrays.sort(n);
        	System.out.println("CASE# " + cont + ":");
        	
        	for (int i=0; i<q.length; i++) {
        		if (Arrays.binarySearch(n, q[i]) >= 0) {

        			for (int j=0; j<n.length; j++) {
        				if (n[j] == q[i]) {

        					System.out.println(q[i] + " found at " + (j+1));
        					break;
        				}
        			}
        		}
        		else {
        			System.out.println(q[i] + " not found");
        		}
        	}
        }
    }
}
