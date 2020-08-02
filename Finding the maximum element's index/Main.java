import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    int maxElem = arr[0];
    int maxIdx = 0;
    for(int i = 1; i < n; i++)
    {
       if(arr[i] > maxElem)
       {
          maxElem = arr[i];
          maxIdx = i; 
       }
    }
    System.out.print(maxIdx);
    
  }
}