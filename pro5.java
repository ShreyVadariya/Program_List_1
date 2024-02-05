/* Write a Java program that takes two integer inputs (a and b) and performs the following operations addition,
subtraction, multiplication, division and modulo. */

public class pro5 
{
    public static void main(String s[]) 
    {
        int a=10,b=3,sum,sub,mul,div,mod;
        
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        mod=a%b;

        System.out.println("Addition is    :: " + sum);
        System.out.println("Subtraction is :: " + sub);
        System.out.println("Multiplication :: " + mul);
        System.out.println("Division is    :: " + div);
        System.out.println("Modulo is      :: " + mod);
    }       
}
