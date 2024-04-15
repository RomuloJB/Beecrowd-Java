import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c = 1;

        while(true) {
        	
        	int properties = sc.nextInt();

        	double totalx = 0;
        	double totaly = 0;
        	
        	if (properties == 0) {
        		break;
        	}
        	
        	int consumption[] = new int[201];
        	
        	for (int j = 0; j < properties; j++) {
        		int  x = sc.nextInt();
        		int  y = sc.nextInt();
        		
        		totalx += x;
        		totaly += y;
        		consumption[y / x] += x;		
        	}
        	
        	System.out.printf("Cidade# %d:%n", c++);
        	
        	boolean z = true;
        	for (int i = 0; i < 201; i++) {
        		if (consumption[i] > 0) {
        			if (z) {
        				z = false;
        			}
        			else {
        				System.out.print(" ");
        			}
        			
        			System.out.printf("%d-%d", consumption[i], i);
        		}
        	}
        	System.out.println("");
        	
        	System.out.printf("Consumo medio: %.2f m3.%n", Math.floor((100.0*totaly)/totalx)/100.0);
        }
    }
}
