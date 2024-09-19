package ClassOOP.Lecture3;

public class Person {

    int hands;
    String name;
    int age;

    public Person() {
        this.hands = 2;
        this.name = "John";
        this.age = 30;
    }

    public Person(Person other){
        this.hands = other.hands;
        this.name = other.name;
        this.age = other.age;
    }

    public void Person(){
        System.out.println("Hands: " + this.hands + " Age: " + this.age + " Name: " + this.name);
    }


    public Person(int hands, String name, int age) {
        this.hands = hands;
        this.name = name;
        this.age = age;
    }
}
