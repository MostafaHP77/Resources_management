package Data;

import java.util.ArrayList;

public class Book extends Resource{
    private String name;
    private int releaseyear;

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public int getReleaseyear() {
        return releaseyear;
    }


}
