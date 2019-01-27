package Data;

import java.util.Date;

public class MyDate {
    private short day;
    private short month;
    private short year;

    public MyDate(short day , short month , short year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(){

    }
    public void setDay(short day){
        this.day = day;
    }
    public void setMonth(short month){
        this.month = month;
    }
    public void setYear(short year){
        this.year = year;
    }

    public short getDay() {
        return day;
    }

    public short getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }
}
