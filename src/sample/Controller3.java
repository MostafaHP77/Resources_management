package sample;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

//Add resource

public class Controller3 {
    public Button add;
    public Button back;
    public Label usercode;


    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }



    public void setBrowse() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Users File");
        Stage stage = new Stage();
        fileChooser.showOpenDialog(stage);
    }

    public void setAdd() {

    }
}
