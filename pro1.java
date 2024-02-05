/* Write a Java program that declares three integer variables (a, b, c) and compute their sum and average. */

public class pro1 
{
    public static void main(String s[]) 
    {
        int a=5,b=10,c=15,sum,avg;
        sum=a+b+c;
        avg=sum/3;

        System.out.println("Sum :: " + sum);
        System.out.println("Average :: " + avg);
    }
}