import java.util.Scanner;
class Main
{
  public static void checkPerfectBatch(int n, int list[])
  {
     int sum = 0;
    for(int i = 0; i < n/2; i++)
    {
       sum = sum + list[i];
    }
    int sum_1 = 0;
    for(int i = n/2 + 1; i < n; i++)
    {
      sum_1 = sum_1 + list[i];
    }
    if(sum == sum_1) 
    {
       System.out.print("Perfect Batch");
    }
    else
    {
       System.out.print("Not a Perfect Batch");
    }
  }
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    checkPerfectBatch(n, arr);
  }
}

      
  
  
       
