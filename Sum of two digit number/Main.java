import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n1= sc.nextInt();
      int q= n1/10;
      int r=n1%10;
      int sum= q+r;
      System.out.println(sum);
      
	}
}