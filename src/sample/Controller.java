package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    public Button login;
    public Button exit;

    @FXML
    public void setLogin() {
        SceneManager.getInstance().loadScene("page2");
    }

    @FXML
    public void setExit(){
        System.exit(0);
    }




}
