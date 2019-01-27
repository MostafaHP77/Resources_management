package Data.User;

import Data.MyDate;
import Data.Resource.*;

import java.io.*;
import java.util.ArrayList;

public class Manager {
    private static Manager ourInstance = new Manager();
    private String password = "admin";
    private ArrayList<Book> book = new ArrayList<>();
    private ArrayList<Magazine> magazine = new ArrayList<>();
    private ArrayList<Thesis> thesis = new ArrayList<>();
    private ArrayList<Member> member = new ArrayList<>();
    public static Manager getInstance() {
        return ourInstance;
    }
    public String getPass(){
        return this.password;
    }
    public void setPass(String pass){
        this.password = pass;
    }

    public ArrayList<Book> getBook() {
        return book;
    }

    public ArrayList<Magazine> getMagazine() {
        return magazine;
    }

    public ArrayList<Thesis> getThesis() {
        return thesis;
    }

    public static void addResourcesInfo(File f){
        String temp ;
        String[] books = new String[4];
        String[] magazines = new String[4];
        String[] thesises = new String[5];
        StringBuilder sb = new StringBuilder();
        char code ;
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(f));
            while (true) {
                temp = br1.readLine();
                if(temp.isEmpty()) {
                    break;
                }
                code = temp.charAt(0);
                if (code == 'b') {
                    books = temp.split(",", 4);
                    ArrayList<String> writers = new ArrayList<>();
                    writers.add(books[3]);
                    Book b1 = new Book(books[1], Integer.parseInt(books[2]), writers);
                    Manager.getInstance().getBook().add(b1);
                    RandomAccessFile f2 = new RandomAccessFile("books.bin","rw");
                    f2.writeChars(b1.code);
                    sb.append(books[1]);
                    sb.setLength(Resource.NAME_LENGTH);
                    f2.writeChars(sb.toString());
                    f2.writeInt(b1.getReleaseyear());
                    int i = 0;
                    sb.delete(0, 49);
                    do {
                        sb.append(writers.get(i));
                        sb.append('/');
                        i++;
                    } while (writers.get(i) == null);
                    sb.setLength(200);
                    f2.writeChars(sb.toString());
                    f2.writeInt(b1.getStatus().hashCode());
                    f2.close();
                }
                if (code == 'm') {
                    magazines = temp.split(",", 4);
                    ArrayList<String> date = new ArrayList<>();
                    date.add(magazines[2].split("/", 3)[0]);
                    date.add(magazines[2].split("/", 3)[1]);
                    date.add(magazines[2].split("/", 3)[2]);
                    Magazine m1 = new Magazine(magazines[1], Integer.parseInt(magazines[3]), new MyDate(Short.parseShort(date.get(2)), Short.parseShort(date.get(1)), Short.parseShort(date.get(0))));
                    Manager.getInstance().getMagazine().add(m1);
                    RandomAccessFile f2 = new RandomAccessFile("mgazines.bin","rw");
                    f2.writeChars(m1.code);
                    sb.delete(0, 49);
                    sb.append(m1.getName());
                    sb.setLength(50);
                    f2.writeChars(sb.toString());
                    f2.writeShort(m1.getDate().getYear());
                    f2.writeChar('/');
                    f2.writeShort(m1.getDate().getMonth());
                    f2.writeChar('/');
                    f2.writeShort(m1.getDate().getDay());
                    f2.writeInt(m1.getNumber());
                    f2.writeInt(m1.getStatus().hashCode());
                    f2.close();
                }
                if (code == 't') {
                    thesises = temp.split(",", 5);
                    ArrayList<String> writers = new ArrayList<>();
                    writers.add(thesises[4]);
                    ArrayList<String> date = new ArrayList<>();
                    date.add(thesises[2].split("/", 3)[0]);
                    date.add(thesises[2].split("/", 3)[1]);
                    date.add(thesises[2].split("/", 3)[2]);
                    Thesis t1 = new Thesis(thesises[1], new MyDate(Short.parseShort(date.get(2)), Short.parseShort(date.get(1)), Short.parseShort(date.get(0))), Grade.valueOf(thesises[3]), thesises[4]);
                    Manager.getInstance().getThesis().add(t1);
                    RandomAccessFile f2 = new RandomAccessFile("thesises.bin","rw");
                    f2.writeChars(t1.code);
                    sb.delete(0, 49);
                    sb.append(t1.getName());
                    sb.setLength(50);
                    f2.writeChars(sb.toString());
                    f2.writeShort(t1.getDate().getYear());
                    f2.writeChar('/');
                    f2.writeShort(t1.getDate().getMonth());
                    f2.writeChar('/');
                    f2.writeShort(t1.getDate().getDay());
                    f2.writeInt(t1.getGrade().hashCode());
                    f2.writeChars(t1.getWriter());
                    f2.writeInt(t1.getStatus().hashCode());
                    f2.close();
                }
            }
        }
        catch(FileNotFoundException e){
                e.printStackTrace();
            }
        catch(IOException e){
                e.printStackTrace();
            }
    }
    public void addUsersInfo(File f){
        
    }
    private Manager() {
    }
}
