package Data.Resource;

import java.util.ArrayList;

public class Book extends Resource implements Borrowable{
    private int releaseyear;

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }
    public int getReleaseyear() {
        return releaseyear;
    }
    public Book(String name , int releaseYear , ArrayList<String> writers){
        super.name = name;
        this.releaseyear = releaseYear;
        super.writer = writers;
    }

    @Override
    public boolean borrow(String name) {
        return false;
    }
}
