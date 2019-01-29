package sample;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


//User search


public class Controller6 {
    public Button search;
    public TextField usercode;
    public ComboBox type;
    public Button back;
    public ListView list;

    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }

    public void setSearch() {

    }

    public void setType() {
        type.getItems().addAll("Student","Teacher","Geust");
        type.getItems().clear();
    }

}
