package sample;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

//Return resource


public class Controller8 {
    public Button search;
    public Button returnresource;
    public Button back;
    public ComboBox usertype;
    public ComboBox resourcetype;
    public TextField usercode;
    public TextField resourcecode;
    public ListView list;

    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }

    public void setSearch() {

    }

    public void setReturnresource() {
    }

    public void setUsertype(){
        usertype.getItems().addAll("Student","Teacher","Geust");
    }

    public void setResourcetype() {
        resourcetype.getItems().addAll("Book","Magazine","Thesis","Map","Cd","Historical Document","Historical Picture");
    }

    public void setList(){

    }

}
