/* Write a Java program that declares two double variables (radius, area) and compute the area of a circle.*/

public class pro2 
{
    public static void main(String s[]) 
    {
        double radius = 7;
        double area;
        double pi = 3.14;

        area = pi * (radius * radius);

        System.out.println("Radius :: " + radius);
        System.out.println("Area of Circle is :: " + area);
    }
}