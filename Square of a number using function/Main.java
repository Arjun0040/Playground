import java.util.Scanner;
class Main
{
  public static int square_of_a_number(int n)
  {
    int result = n * n;
    return result; 
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    System.out.println(square_of_a_number(n));
  }
}