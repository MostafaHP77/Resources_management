package Data.Resource;

import java.util.ArrayList;

public class Book extends Resource implements Borrowable{
    private int releaseyear;
    public static final int BOOK_LENGHT = NAME_LENGTH*2+4+4+200+2+4;
    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }
    public int getReleaseyear() {
        return releaseyear;
    }
    public Book(String name , int releaseYear , ArrayList<String> writers){
        super.setName(name);
        this.releaseyear = releaseYear;
        super.setWriter(writers);
    }

    @Override
    public boolean borrow(String name) {
        return false;
    }
}
