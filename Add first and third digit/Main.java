import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
      	int givenNumber =  sc.nextInt(); 
      
     	int firstDigit = givenNumber/100; 
        int lastDigit = givenNumber%10;
      	
      	int sum = firstDigit + lastDigit; 
      	System.out.println(sum); 
	}
}