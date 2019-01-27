package sample;

import javafx.scene.control.Button;

import javafx.scene.control.ListView;

//Black List

public class Controller9 {
    public ListView list;
    public Button back;

        public void setBack() {
            SceneManager.getInstance().loadScene("page2");
        }
}
