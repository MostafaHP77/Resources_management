package sample;

import Data.User.Manager;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.File;

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
        Manager.getInstance().borrow(getUsertype(),getResourcetype(),usercode.getText(),resourcename.getText());

    }

    public void setSearch(){

    }


    public void setResourcetype(){
        resourcetype.getItems().addAll("Book","Magazine","Thesis","Map","Cd","Historical Document","Historical Picture");
        resourcetype.getItems().clear();

    }

    public File getResourcetype() {
        String resource =   resourcetype.getValue().toString();
        switch (resource){
            case "Book":
                return new File("book.bin");

            case "Magazine":
                return new File("magazine.bin");
            case "Thesis" :
                return new File("thesis.bin");
        }
        return null;
    }

    public void setUsertype(){
        usertype.getItems().addAll("Student","Teacher","Guest");
        usertype.getItems().clear();
    }

    public File getUsertype() {
        String user = usertype.getValue().toString();
        switch (user) {

            case "Student":
                return new File("student.bin");

            case "Teacher":
                return new File("teacher.bin");

            case "Guest":
                return new File("guest.bin");
        }
        return null;
        }

    public void setList() {

    }



}
