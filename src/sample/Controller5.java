package sample;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

//Resource search

public class Controller5 {
    public Button search;
    public Button back;
    public TextField sourcename;
    public ComboBox type;

    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }

    public void setSearch() {

    }

    public void setType() {

    }
}
