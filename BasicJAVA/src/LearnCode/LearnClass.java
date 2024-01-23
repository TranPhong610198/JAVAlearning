package LearnCode;
//import java.util.*;
class Person{
    public String name;
    public float height;
    public int age;
    
    public Person(String name, int age, float height){
        this.name= name;
        this.age=age;
        this.height=height;
    }
    
    public void eat(String foodName){
        System.out.println(name + " is eating " + foodName);
    }
    
    public int getAge(){
        return age;
    }
    public void display(){
        System.out.println(name + "," + age + " years old, height: "+ height +"m");
    }
}

public class LearnClass {
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
        Person a = new Person("Moriarty", 19, 1.6f);
        a.eat("Rice");
        a.display();
    }
}
