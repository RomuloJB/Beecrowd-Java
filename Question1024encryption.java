import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
        	String word = sc.nextLine();
        	
        	String word1 = "";
        	String invert = "";
        	String last = "";
        	        	
        	for (int j=0; j < word.length(); j++){
        		int numASCII = (int) word.charAt(j);
        		
                if ((numASCII >= 65 && numASCII <= 90) || (numASCII >= 97 && numASCII <= 122)){
        			numASCII = numASCII + 3;
        			char letters = (char) numASCII;
        			word1 += letters;
        		}
        		else {
        			char letters = (char) numASCII;
        			word1 += letters;
        		}
        	}
        	for (int j = word.length()-1; j >=0; j--){
        		invert += word1.charAt(j);
        	}
        	for (int j=0; j < word.length(); j++) {
        		int numASCII = (int) invert.charAt(j);
        		if (j >= word.length()/2) {
        			numASCII = numASCII - 1;
        			char letters = (char) numASCII;
        			last += letters;
        		}
        		else {
        			char letters = (char) numASCII;
        			last += letters;
        		}
        		
        	}
        	System.out.println(last);
        }
    }
 
}
