package ClassOOP.Lecture3;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("Hands: " + p1.hands + " Age: " + p1.age + " Name: " + p1.name );

        p1.Person();

        Person p2 = new Person(p1);
        System.out.println("Hands: " + p2.hands + " Age: " + p2.age + " Name: " + p2.name );

        Person p3 = new Person(4 , "Ali" , 34);
        System.out.println("Hands: " + p3.hands + " Age: " + p3.age + " Name: " + p3.name );



    }
}
