package Data.Resource;

public class Cd extends Resource implements Borrowable{
    private int releasedate;
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleasedate(int releasedate) {
        this.releasedate = releasedate;
    }

    public int getReleasedate() {
        return releasedate;
    }

    public String getTitle(){
        return title;

    }

    public Cd(String name , int releaseddate , String title){
        super.setName(name);
        this.releasedate = releaseddate;
        this.title = title ;
    }

    @Override
    public boolean borrow(String name) {
        return false;
    }
}
