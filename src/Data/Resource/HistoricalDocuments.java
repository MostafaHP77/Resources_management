package Data.Resource;

public class HistoricalDocuments extends Resource implements Borrowable {

    private int releasedate;
    private String title ;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setReleasedate(int releasedate) {
        this.releasedate = releasedate;
    }

    public int getReleasedate() {
        return releasedate;
    }

    public  HistoricalDocuments(String name , int releasedate , String title){
        super.setName(name);
        this.releasedate = releasedate;
        this.title = title;
    }



    @Override
    public boolean borrow(String name) {
        return false;
    }
}
