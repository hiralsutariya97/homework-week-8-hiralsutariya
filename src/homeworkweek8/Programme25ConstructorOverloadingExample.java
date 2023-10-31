package homeworkweek8;

public class Programme25ConstructorOverloadingExample {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Programme25ConstructorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //crating three arg constructor
    Programme25ConstructorOverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Programme25ConstructorOverloadingExample s = new Programme25ConstructorOverloadingExample(111, "Karan");
        Programme25ConstructorOverloadingExample s1 = new Programme25ConstructorOverloadingExample(222, "Aryan", 25);
        s.display();
        s1.display();
    }
}

