package ClassOOP.Lecture4.Lab;

public class Test{

    public static void main(String[] args){
        Time t1 = new Time(15,7,3);
        //t1.display();//

        /*t1.setSecond(4);
        t1.setMinute(3);
        t1.setHour(6);
        t1.display();*/

        Date d1 = new Date(4 , 5 , 2004 , t1);
        d1.display();

        Date d2 = new Date(d1);
        d2.display();

        d1.getTime().setSecond(2);
        d1.display();
        d2.display();

    }
}
