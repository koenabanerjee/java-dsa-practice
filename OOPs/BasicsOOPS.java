package OOPs;

public class BasicsOOPS {
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "koenaBanerjee";
        //myAcc.password = "abcdefghi"; //not visible
        myAcc.setPassword("abcdefghi");

        Student s1 = new Student();
        //System.out.println(s1.name);
        // Student s2 = new Student("Koena");
        // Student s3 = new Student(123);

        s1.name = "Koena";
        s1.roll = 456;
        s1.password = "abcd";

        

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

         Student s2 = new Student(s1); //copy
         s2.password = "xyz";

        s1.marks[2] = 100;
        for(int i = 0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

        Fish shark = new Fish();
        shark.eat();

        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1,2,3));

        Deer d = new Deer();
        d.eat();

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();

        System.out.println(h.color);

        Queen q = new Queen();
        q.moves();

        Stud stu1 = new Stud();
        stu1.schoolName ="JMV";

        Stud stu2 = new Stud();
        System.out.println(stu2.schoolName);
            
        };
        

    }

    
    class Stud {
        String name;
        int roll;

        static String schoolName;

        void setName(String name){
            this.name = name;
        }

        String getName(){
            return this.name;
        }
    }


//ABSTRACTION

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonal( by 1 step)");
    }


}
//ABSTRACT CLASS
abstract class Ani {
    String color;

    Ani(){
        color = "brown";
    }
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Ani{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Ani {
    void changeColor(){
        color = "yellow";
    }
     void walk(){
        System.out.println("Walks on 2 legs");
    }
}

//INHERITANCE
class Animall{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animall{
    void eat(){
        System.out.println("eats grass");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

}

class Pen {
    //properties + functions
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}

class Student {
    String name;
    int roll;
    float percentage; //cgpa
    String password;
    int marks[];
   

    //CONSTRUCTOR
    Student(){
         marks = new int[3];
        //this.name = name;
        System.out.println("Constructor is called");
    }

    Student(String name){

        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }

    //shallow COPY CONSTRUCTOR
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = marks;
    // }

    //DEEP COPY CONSTRUCTOR
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }

    }

    


}

//BASE CLASS
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//DERIVED CLASS
class Fish extends Animal{
    int fins;
    void swim() {
        System.out.println("Swims in water");
    }
}

class Calculator {
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}

