package Data.Resource;

public class HistoricalPictures extends Resource implements Borrowable {
    private String photographername ;
    private int releasedate;

    public void setPhotographername(String photographername) {
        this.photographername = photographername;
    }

    public String getPhotographername() {
        return photographername;
    }

    public void setReleasedate(int releasedate) {
        this.releasedate = releasedate;
    }

    public int getReleasedate() {
        return releasedate;
    }

    public HistoricalPictures(String name , String photographername , int releasedate ){
        super.setName(name);
        this.photographername = photographername;
        this.releasedate = releasedate;
    }

    @Override
    public boolean borrow(String name) {
        return false;
    }
}
