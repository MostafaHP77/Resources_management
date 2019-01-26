package Data;

import java.util.ArrayList;

public class Magazine extends Data.Resource implements Data.Loanperiod {
    private Byte number;

    public void setNumber(Byte number) {
        this.number = number;
    }

    public Byte getNumber() {
        return number;
    }


}
