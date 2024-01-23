package LuyenCode;

// Print screen area and circumference of circle radius r
import java.util.Scanner;
public class CB07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float pi = 3.140f;
        float r = input.nextFloat();
        System.out.println(2*pi*r +" "+ pi*r*r);
    }
}
