package Data.User;

import Data.MyDate;
import Data.Resource.Book;
import Data.Resource.Magazine;
import Data.Resource.Resource;

import java.io.*;
import java.util.ArrayList;

public class Manager {
    private static Manager ourInstance = new Manager();
    private String password = "admin";

    public static Manager getInstance() {
        return ourInstance;
    }
    public String getPass(){
        return this.password;
    }
    public void setPass(String pass){
        this.password = pass;
    }
    public static boolean addResourcesInfo(File f , RandomAccessFile f2){
        String temp ;
        String[] books = new String[4];
        String[] magazines = new String[4];
        String[] thesises = new String[5];
        StringBuilder sb = new StringBuilder();
        char code ;
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(f));
            temp = br1.readLine();
            code = temp.charAt(0);
            if(code == 'b'){
                books = temp.split(",",4);
                ArrayList<String> writers = new ArrayList<>();
                writers.add(books[3]);
                Book b1 = new Book(books[1],Integer.parseInt(books[2]),writers);
                f2.writeChars(b1.code);
                sb.append(books[1]);
                sb.setLength(Resource.NAME_LENGTH);
                f2.writeChars(sb.toString());
                f2.writeInt(b1.getReleaseyear());
                int i = 0;
                sb.delete(0,49);
                do{
                    sb.append(writers.get(i));
                    sb.append('/');
                    i++;
                } while(writers.get(i)==null);
                sb.setLength(200);
                f2.writeChars(sb.toString());
            }
            if(code == 'm'){
                magazines = temp.split(",",4);
                ArrayList<String> date = new ArrayList<>();
                date.add(magazines[2].split("/",3)[0]);
                date.add(magazines[2].split("/",3)[1]);
                date.add(magazines[2].split("/",3)[2]);
                Magazine m1 = new Magazine(magazines[1],Integer.parseInt(magazines[3]),new MyDate(Short.parseShort(date.get(2)),Short.parseShort(date.get(1)),Short.parseShort(date.get(0))));
                f2.writeChars(m1.code);
                sb.delete(0,49);
                sb.append(m1.getName());
                sb.setLength(50);
                f2.writeChars(sb.toString());
                f2.writeShort(m1.getDate().getYear());
                f2.writeChar('/');
                f2.writeShort(m1.getDate().getMonth());
                f2.writeChar('/');
                f2.writeShort(m1.getDate().getDay());
                f2.writeInt(m1.getNumber());
            }
            if(code == 't') {
                thesises = temp.split(",", 5);

            }
        }
        catch(FileNotFoundException e){

        }
        catch(IOException e){

        }
        return true;
    }

    private Manager() {
    }
}
