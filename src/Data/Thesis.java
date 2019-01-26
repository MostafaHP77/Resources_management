package Data;

public class Thesis extends Resource {
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
        super.name = name;
        setDate(d);
        setGrade(g);
    }
}
