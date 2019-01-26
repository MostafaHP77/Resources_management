package Data.Data;

import java.util.ArrayList;

public abstract class Resource {
    public Byte count = 0 ;
    public String code;
    public String name ;
    public ArrayList<String> writer = new ArrayList<String>();

    public void addWriter(String writer) {
        this.writer.add(writer);
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
