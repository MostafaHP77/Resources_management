package Data.Resource;

import java.util.ArrayList;

public abstract class Resource implements Borrowable {
    public static Byte count = 0 ;
    public String code;
    public String name ;
    private Status state = Status.exist;
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
    public Status getStatus(){
        return this.state;
    }
    public static String getCode() {
        return "R"+ count ;
    }
}
