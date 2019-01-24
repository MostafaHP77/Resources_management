package Data.Data;

public class MyDate {
    private byte day;
    private byte month;
    private short year;

    public MyDate(byte day , byte month , short year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(){

    }
    public void setDay(byte day){
        this.day = day;
    }
    public void setMonth(byte month){
        this.month = month;
    }
    public void setYear(short year){
        this.year = year;
    }

    public byte getDay() {
        return day;
    }

    public byte getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }
}
