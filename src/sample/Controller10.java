package sample;

import javafx.scene.control.Button;
import  javafx.scene.control.TextField;

public class Controller10 {
    public TextField newpass;
    public TextField confirmpass;
    public Button confirm;
    public Button back;

    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }

    public void setConfirm() {

    }
}
