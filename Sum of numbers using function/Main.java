import java.util.Scanner;
class Main{
	public static int sum_of_numbers(int num)
    {
      int sum = 0; 
      int n = 1; 
      while( n <= num)
      {
      sum = sum + n; 
        n = n + 1;
      }
      return sum;
    }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int m = sc.nextInt();
    System.out.println(sum_of_numbers(m));
  }
}
      
    
       