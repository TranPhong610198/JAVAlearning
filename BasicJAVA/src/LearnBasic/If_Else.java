package LearnBasic;
import java.util.*;
public class If_Else {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        
        if(age <18)
            System.out.println("You're kid");
        else if(age >= 18 && age <= 30)
            System.out.println("Your're gentlement");
        else
            System.out.println("You're Old");
    }
}
