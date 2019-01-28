package sample;

import Data.User.Manager;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

//Add resource


public class Controller4 {
    public Button browse;
    public Button add;
    public Button back;
    public TextField path;
    public File file ;
    public void setAdd() {
        Manager.getInstance().addResourcesInfo(file);
    }

    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }

    public void setBrowse() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        Stage stage = new Stage();
        file = fileChooser.showOpenDialog(stage);
        path.setText(file.getAbsolutePath());
    }
}

