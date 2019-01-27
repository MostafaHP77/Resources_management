package sample;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller3 {
    public Button add;
    public Button back;
    public TextField name;
    public TextField family;
    public Label usercode;
    public ComboBox usertype;
    public void setAdd() {

    }

    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }
}
