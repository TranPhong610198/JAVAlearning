import java.util.Scanner;
public class CB05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(a-(a/b)*b);
    }
}
