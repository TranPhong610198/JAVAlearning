/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LearnOOP;
/**
 *
 * @author tphon
 */
// In this Day, I was learn about key word "This" in Java
class Person{
    public String name;
    public int age;
    public float height;
    
    public Person(String name, int age, float height){
        name = name;        //  Output = null
        age = age;          //  Output = 0
        height = height;    //  Output = 0.000
    }
}

public class LearnThis {
    public static void main(String[] args){
        Person a = new Person("Moriarty", 19, 1.65f);
        System.out.println(a.age);
        System.out.println(a.height);
        System.out.println(a.name);
    }
    
}
