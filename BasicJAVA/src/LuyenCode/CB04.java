package LuyenCode;

// Print screen addition, subtraction, multiplication, division of a and b
import java.util.Scanner;
public class CB04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        int sum = a+b, difference = a-b, product = a*b;
        float trade = (float)a/b;
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.printf("%.2f\n",trade);
    }
}
