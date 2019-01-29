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

    public void setUsertype() {
        if (usertype.getItems().isEmpty()){
            usertype.getItems().addAll("Student", "Teacher", "Geust");
    }else
        usertype.getItems().clear();
    }

    public void setResourcetype() {
        if (resourcetype.getItems().isEmpty()) {
            resourcetype.getItems().addAll("Book", "Magazine", "Thesis", "Map", "Cd", "Historical Document", "Historical Picture");
        }else
        resourcetype.getItems().clear();
    }

    public void setList(){

    }

}
