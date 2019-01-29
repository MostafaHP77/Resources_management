package sample;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

//Lend

public class Controller7 {
    public Button back;
    public Button lend;
    public Button search;
    public ComboBox<String> resourcetype;
    public ComboBox usertype;
    public TextField resourcename;
    public TextField usercode;
    public ListView list;


    public void setBack() {
        SceneManager.getInstance().loadScene("page2");
    }

    public void setLend(){

    }

    public void setSearch(){

    }


    public void setResourcetype(){
        resourcetype.getItems().addAll("Book","Magazine","Thesis","Map","Cd","Historical Document","Historical Picture");

    }

    public void setUsertype(){
        usertype.getItems().addAll("Student","Teacher","Geust");

    }



    public void setList() {

    }



}
