import java.util.Scanner;

public class pro12 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array :: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array ::");
        
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        
        int product = 1;
        int i = 0;
        
        while (i < n) 
        {
            product *= arr[i];
            i++;
        }
        System.out.println("Product of all elements in the array :: " + product);
        scanner.close();
    }
}
