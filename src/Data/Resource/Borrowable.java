package Data.Resource;

public interface Borrowable {
    int borrowDays = 14;
    boolean borrow(String name);
}
