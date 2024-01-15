// Print screen sum a and b, follow the format a + b = c
import java.util.Scanner;
public class CB08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.printf("%d + %d = %d", a, b, a+b);
    }
}
