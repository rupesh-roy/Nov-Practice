import java.util.Scanner;
public class FirstProgram
{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter number:");
      int n=scan.nextInt();
      System.out.println("_____________");
      for(int i=0;i<=5;i++)
      {
          for(int j=0;j<=i;j++)
          {
              System.out.print(n);
          }
          System.out.println();
      }
    }
}