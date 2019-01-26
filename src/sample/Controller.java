package sample;

import javafx.scene.control.Button;

public class Controller {
    public Button login;


    public void setLogin(Button login) {
        this.login = login;
        SceneManager.getInstance().loadScene("page2");
    }

}
