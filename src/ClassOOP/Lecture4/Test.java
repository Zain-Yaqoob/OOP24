package ClassOOP.Lecture4;

public class Test{

    public static void main(String args[]){

        System.out.println( new A() );

        A obj1 = new A();

        System.out.println(obj1);

        obj1.A();
       //METHOD 1//
       //In this method we simply make two objects equal, so are passed by reference//
        Date d1= new Date(13, 9, 2024);

        d1.display();

        // new Date(1,1,1).display();

        Date d2 = d1;
        // change in value of 1 will display in another as well//
        d2.display();
        d2.day=20;
        d1.display();
        d2.display();

        //Method 2//
        // This will create another obj who is a copy and is not passed by reference only//
        // value is passed, so  change in one variable won't display in another//
        Date temp=new Date(d1.day,d1.month, d1.year);
        d1.display();
        temp.display();

        d1.day = 4;
        d1.display();
        temp.display();

        temp.day = 5;
        d1.display();
        temp.display();

        //Method 3//
        //This method is also passed by value only//
        Date temp2 =new Date(temp);
        temp.display();
        temp2.display();

        temp.day = 6;
        temp.display();
        temp2.display();

        temp2.day = 9;
        temp.display();
        temp2.display();
    }
}
