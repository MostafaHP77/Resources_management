package sample;

import Data.User.Manager;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import  javafx.scene.control.TextField;


//Change pass


public class Controller10 {
    public TextField newpass;
    public TextField confirmpass;
    public Button confirm;
    public Button back;
    public Label l1;
    public Label l2;
    public Label l3;

    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }

    public void setConfirm() {
        Manager.getInstance().setPass(newpass.getText());
        if (confirmpass.getText().equals(newpass.getText()) && !newpass.getText().isEmpty() && !confirmpass.getText().isEmpty()){
            l2.setVisible(false);
            l3.setVisible(false);
            l1.setVisible(true);
            Manager.getInstance().setPass(newpass.getText());
        }else if (newpass.getText().isEmpty() ||confirmpass.getText().isEmpty()){
            l1.setVisible(false);
            l2.setVisible(false);
            l3.setVisible(true);
            newpass.clear();
            confirmpass.clear();
        }
        else {
            l1.setVisible(false);
            l3.setVisible(false);
            l2.setVisible(true);
            newpass.clear();
            confirmpass.clear();
        }
    }
}
