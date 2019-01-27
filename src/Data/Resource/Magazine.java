package Data.Resource;

import Data.MyDate;

public class Magazine extends Resource implements Borrowable {
    private int issue;
    public static final int MAGAZINE_LENGTH = NAME_LENGTH * 2 +4+4+10;
    private MyDate date = new MyDate();
    public void setNumber(int number) {
        this.issue = number;
    }
    public MyDate getDate(){
        return date;
    }

    public int getNumber() {
        return issue;
    }
    @Override
    public boolean borrow(String a){
        return true;
    }
    public Magazine(String name , int issue , MyDate d){
        super.setName(name);
        this.issue = issue;
        this.date = d;
    }
}
