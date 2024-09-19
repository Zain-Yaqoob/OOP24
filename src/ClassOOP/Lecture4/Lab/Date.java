package ClassOOP.Lecture4.Lab;

class Date{

    int day;
    int month;
    int year;
    Time time;

    public void setTime(Time t){
        time = t;
    }

    public Time getTime(){
        return time;
    }

    Date(int d, int m, int y, Time t){
        day = d;
        month = m;
        year = y;
        time = t;
    }


    Date(int d, int m, int y){
        day=d;
        month=m;
        year=y;
    }

    Date(Date d){
        day=d.day;
        month=d.month;
        year=d.year;
        time = new Time(d.time);
    }

    public void display(){
        System.out.println(" Date is = "+ day +"-"+month+"-"+year);
        System.out.println(" Time is = "+ time.getHour() + "-" + time.getMinute() + "-" + time.getSecond());

    }

}
