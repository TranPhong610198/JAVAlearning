package LearnBasic;
import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //switch case trong java cũng sẽ tương tự như trong C
        System.out.print("Input your choice: ");
        int chose = scan.nextInt();
        
        switch(chose){
            case 1:
                System.out.println("You chose 1");
                break;
            case 2:
                System.out.println("You chose 2");
                break;
            case 3:
                System.out.println("You chose 3");
                break;
            default:
                System.out.println("You chose a number that difference 1, 2 and 3");
        }
    }
}
