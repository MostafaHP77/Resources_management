package Data.Resource;

import Data.MyDate;

public class Thesis extends Resource implements Borrowable{
    private MyDate date;
    private Grade grade;
    private String Writer;
    public static final int THESIS_LENGTH = NAME_LENGTH*2 + 4 + 8*2 + 4 + 200;

    public void setGrade(Grade g){
        this.grade = g;
    }
    public Grade getGrade(){
        return this.grade;
    }

    public MyDate getDate() {
        return date;
    }
    public void setWriter(String writer){
        this.Writer = writer;
    }
    public String getWriter(){
        return this.Writer;
    }


    public void setDate(MyDate date) {
        this.date = date;
    }
    public Thesis(String name , MyDate d , Grade g , String writer){
        super.setName(name);
        setDate(d);
        setGrade(g);
        setWriter(writer);
    }
    @Override
    public boolean borrow(String name) {
        return false;
    }
}
