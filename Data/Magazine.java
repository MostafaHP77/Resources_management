import java.util.ArrayList;

public class Magazine extends Resource implements Loanperiod {
    private Byte number;

    public void setNumber(Byte number) {
        this.number = number;
    }

    public Byte getNumber() {
        return number;
    }


}