package Data.Resource;

import java.util.ArrayList;

public abstract class Resource implements Borrowable {
    private static Byte count = 0 ;
    public static final int NAME_LENGTH = 50;
    public String code;
    private String name ;
    private Status state = Status.exist;
    private ArrayList<String> writer = new ArrayList<String>();

    public void addWriter(String writer) {
        this.writer.add(writer);
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
    public void setState(Status state){
        this.state = state;
    }
    public static String getCode() {
        return "R"+ count ;
    }

    public void setWriter(ArrayList<String> writer) {
        this.writer = writer;
    }
}

