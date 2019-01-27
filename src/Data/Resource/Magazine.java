package Data.Resource;

import Data.MyDate;

public class Magazine extends Resource implements Borrowable {
    private int issue;
    private MyDate date = new MyDate();
    public void setNumber(int number) {
        this.issue = number;
    }

    public int getNumber() {
        return issue;
    }
    @Override
    public boolean borrow(String a){
        return true;
    }
    public Magazine(String name , int issue , MyDate d){
        super.name = name;
        this.issue = issue;
        this.date = d;
    }
}
