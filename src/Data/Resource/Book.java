package Data;

import java.util.ArrayList;

public class Book extends Resource{
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
}
