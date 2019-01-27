package sample;

import javafx.scene.control.Button;

import javax.swing.text.html.ListView;

public class Controller9 {
    public ListView list;
    public Button back;

        public void setBack() {
            SceneManager.getInstance().loadScene("page2");
        }
}
