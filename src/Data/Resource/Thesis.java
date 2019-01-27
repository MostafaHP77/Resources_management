package Data.Resource;

import Data.MyDate;

public class Thesis extends Resource implements Borrowable{
    private MyDate date;
    private Grade grade;

    public void setGrade(Grade g){
        this.grade = g;
    }
    public Grade getGrade(){
        return this.grade;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }
    public Thesis(String name , MyDate d , Grade g){
        super.setName(name);
        setDate(d);
        setGrade(g);
    }

    @Override
    public boolean borrow(String name) {
        return false;
    }
}
