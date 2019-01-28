package sample;

import Data.User.Manager;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

//Add User

public class Controller3 {
    public Button add;
    public Button back;
    public Label usercode;
    public TextField path;
    public File file;

    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }



    public void setBrowse() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Users File");
        Stage stage = new Stage();
        file  = fileChooser.showOpenDialog(stage);
        path.setText(file.getAbsolutePath());

    }
    public void setAdd() {
        Manager.getInstance().addUsersInfo(file);
    }
}
