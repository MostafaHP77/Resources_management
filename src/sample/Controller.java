package sample;

import Data.User.Manager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//sample

public class Controller {
    @FXML
    public Button login;
    public Button exit;
    public Label error;
    public TextField pass;

    @FXML


    public void setLogin() {

        if(Manager.getInstance().getPass().equals(pass.getText())){
            SceneManager.getInstance().loadScene("page2");
            error.setVisible(false);
            pass.clear();
        }

        else if (pass.getText()==null){
            error.setVisible(true);
            pass.clear();

        }
        else{
            error.setVisible(true);
            pass.clear();
        }



    }

    public void setExit(){
        System.exit(0);
    }






}
