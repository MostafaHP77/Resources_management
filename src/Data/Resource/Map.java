package Data.Resource;

public class Map extends Resource implements Borrowable {
    private int releasedate;
    private String title;
    private int Scale;

    public void setScale(int scale) {
        Scale = scale;
    }

    public int getScale() {
        return Scale;
    }

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

    public Map(String name , String title , int releasedate , int scale){
        super.setName(name);
        this.title = title;
        this.releasedate = releasedate;
        this.Scale = scale;
    }

    @Override
    public boolean borrow(String name) {
        return false;
    }
}
