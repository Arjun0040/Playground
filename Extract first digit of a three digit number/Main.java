import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
      	
      	int num = sc.nextInt(); 
      	
      	int firstDigit = num/100; 
      	
      	System.out.println(firstDigit); 
	}
}