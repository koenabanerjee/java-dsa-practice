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

        Student s2 = new Student(s1); //copy
        s2.password = "xyz";
        

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
   

    //CONSTRUCTOR
    Student(){
        //this.name = name;
        System.out.println("Constructor is called");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }

    //COPY CONSTRUCTOR
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
}

