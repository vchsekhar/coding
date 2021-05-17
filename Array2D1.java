/*Read and display elements of MXN Matrix.  if M=3  and N=2
1 2 
3 4 
5 6 
*/
import java.util.*;
class Array2D1
{
 public static void main(String args[])
 {
 //int a[][]={{1,2},{3,4},{5,6}};
   System.out.println("How many rows u want?");
   Scanner sc=new Scanner(System.in);
   int m=sc.nextInt();
   System.out.println("How many elements in each row u want?");
   int n=sc.nextInt();
   int a[][]=new int[m][n];
  System.out.println("Enter "+(m*n)+"Array elements");
  for(int i=0; i<m;i++)
   {
    for(int j=0; j<n;j++)
     {
        a[i][j]=sc.nextInt();
     }
   }
  System.out.println("Array elements are as follows");
/*  
 for(int i=0; i<m;i++)
   {
    for(int j=0; j<n;j++)
     {
      System.out.print(a[i][j]+" ");
     }
    System.out.println(); 
   }
*/
 for(int[]  x:a)
  {
    for(int  y:x)
     {
         System.out.print(y+" ");
     }
     System.out.println(); 
  }

 }
}
 

 