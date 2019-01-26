package Data.Data;

import java.util.ArrayList;

public class Resource {
    public Byte count = 0 ;
    public String code;
    public String name ;
    public String  tilte;
    public ArrayList<String> writer = new ArrayList<String>();

    public void setWriter(ArrayList<String> writer) {
        this.writer = writer;
    }

    public ArrayList<String> getWriter() {
        return writer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return "R"+ count ;
    }





}
