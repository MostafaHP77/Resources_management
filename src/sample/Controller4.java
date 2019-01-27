package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller4 {
    public Button browse;
    public Button add;
    public Button back;
    public TextField path;

    public void setAdd() {

    }

    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }

    public void setBrowse() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        Stage stage = new Stage();
        fileChooser.showOpenDialog(stage);
        path.setText(fileChooser.getInitialFileName());

    }
}

