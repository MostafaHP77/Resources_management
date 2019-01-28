package Data.User;

import Data.AlphabeticException;
import Data.Resource.Borrowable;
import Data.MyDate;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;

public class Member implements Borrowable {
    private String name;
    private String family;
    private final String code;
    public static final int NAME_LENGTH = 50;
    public static final int MEMBER_LENGTH = NAME_LENGTH*4 + 4 + 10 + 4;
    private MyDate membershipDate;
    private MemberType type;
    private  MemberStatus state = MemberStatus.ok;
    private static int MemberCount;
    private static int LCount;
    private static int SCount;
    private static int GCount;

    public void setName(String name) throws AlphabeticException {
        if(name.contains("0") || name.contains("1") || name.contains("2") || name.contains("3") || name.contains("4") || name.contains("5") || name.contains("6") || name.contains("7") || name.contains("8") || name.contains("9")) {
            throw new AlphabeticException("invalid name!!");
        }
        else this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setFamily(String family) throws AlphabeticException{
        if(family.contains("0") || family.contains("1") || family.contains("2") || family.contains("3") || family.contains("4") || family.contains("5") || family.contains("6") || family.contains("7") || family.contains("8") || family.contains("9")) {
            throw new AlphabeticException("invalid family!!");
        }
        else this.family = family;
    }
    public String getFamily(){
        return family;
    }

    public String getCode() {
        return code;
    }

    public MyDate getMembershipDate() {
        return membershipDate;
    }

    public MemberType getType() {
        return type;
    }

    public static int getMemberCount() {
        return MemberCount;
    }

    public static int getLCount() {
        return LCount;
    }

    public static int getSCount() {
        return SCount;
    }

    public static int getGCount() {
        return GCount;
    }
    public boolean borrow(String name){


        return true;
    }

    public Member (String name, String family, MemberType type) throws AlphabeticException {
        setName(name);
        setFamily(family);
        if(type.toString().equalsIgnoreCase("L")) {
            LCount++;
            MemberCount ++;
            this.code = type.toString().concat(Integer.toString(LCount));
        }
        else if(type.toString().equalsIgnoreCase("S")) {
            SCount ++;
            MemberCount ++;
            this.code = type.toString().concat(Integer.toString(SCount));
        }
        else {
            GCount ++;
            MemberCount ++;
            this.code = type.toString().concat(Integer.toString(GCount));
        }
        this.type = type;
        Date d = new Date();
        this.membershipDate = new MyDate((short)d.getDate(),(short)d.getMonth(),(short)d.getYear());
    }
    public Member(){
        this.code = "l1";
    }
    public static void main(String[] args){
        try {
            RandomAccessFile rr1 = new RandomAccessFile("E:/data.bin", "rw");
            rr1.writeInt(3);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
