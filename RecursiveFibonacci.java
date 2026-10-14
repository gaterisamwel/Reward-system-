import java.util.Scanner;
public class RecursiveFibonacci
{
 public static int fib(int n)
 {
   if (n<=1) return n; 
   return fib(n-1) + fib(n-2);
 }
 public static void main(String[] args)
 {
    int n=50;
    System.out.println("fibonacci series using recursive function");
    for(int i=0;i<n;i++)
    {
        System.out.println(fib(i)+ " ");
    }
 }
} //slow for large numbers ,//
//the number of calls for n=30,make over a million calls ,n=50 more than a billion time //
//inefficient coz recursion wastes time recomputing the previous values//
