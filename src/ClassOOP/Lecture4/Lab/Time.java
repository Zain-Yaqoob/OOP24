package ClassOOP.Lecture4.Lab;

public class Time{
    private int second;
    private int minute;
    private int hour;


    Time(int s , int m , int h){
        second = s;
        minute = m;
        hour = h;
    }

    public Time(Time old){
        second  = old.second;
        minute = old.minute;
        hour = old.hour;
    }




    public void setSecond(int s){
        if(s >= 0 && s < 60){
            second = s;
        }
    }

    public void setMinute(int m){
        if(m >= 0 && m < 60 ){
            minute = m;
        }
    }

    public void setHour(int h){
        if( h >= 0 && h < 24 ){
            hour = h;
        }
    }

    public int getSecond(){
        return second;
    }

    public int getMinute(){
        return minute;
    }

    public int getHour(){
        return hour;
    }

    public void display(){
        System.out.println(" Time is =  " + hour + ":" + minute + ":" + second);
    }

}
