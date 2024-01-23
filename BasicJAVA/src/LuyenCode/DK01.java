package LuyenCode;

//find max of two numbers a and b
import java.util.*;
public class DK01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(((Math.abs(a-b)) + (a+b))/2);
    }
}
