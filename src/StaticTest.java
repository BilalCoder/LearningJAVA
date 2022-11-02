
class StaticTest{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    StaticTest(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object
class TestStaticMethod{
    public static void main(String args[]){
        //StaticTest.change();//calling change method
        //creating objects
        StaticTest s1 = new StaticTest(111,"Karan");

        StaticTest s2 = new StaticTest(222,"Aryan");
        s2.change();
        StaticTest s3 = new StaticTest(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}