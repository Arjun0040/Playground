import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in); 
   	int n = sc.nextInt(); 
    
    int lastDigit = n%10; 
    int secondLastDigit = (n/10) % 10; 
    int firstDigit = n/100; 
    int reversedDigit = lastDigit*100 + secondLastDigit*10 + firstDigit; 
    
    System.out.print(reversedDigit); 
  }
  

  
  
  
}