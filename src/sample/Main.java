package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Resource Management");
        SceneManager.getInstance().setStage(primaryStage);

        Parent root2 = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Parent root3 = FXMLLoader.load(getClass().getResource("Add User.fxml"));
        Parent root4 = FXMLLoader.load(getClass().getResource("Add Resource.fxml"));
        Parent root5 = FXMLLoader.load(getClass().getResource("Resource Search.fxml"));
        Parent root6 = FXMLLoader.load(getClass().getResource("User Search.fxml"));
        Parent root7 = FXMLLoader.load(getClass().getResource("Lend.fxml"));
        Parent root8 = FXMLLoader.load(getClass().getResource("Return Resource.fxml"));
        Parent root9 = FXMLLoader.load(getClass().getResource("Black List.fxml"));
        Parent root10 = FXMLLoader.load(getClass().getResource("Change Password.fxml"));


        SceneManager.getInstance().addScene("page1",new Scene(root));
        SceneManager.getInstance().addScene("page2",new Scene(root2));
        SceneManager.getInstance().addScene("page3",new Scene(root3));
        SceneManager.getInstance().addScene("page4",new Scene(root4));
        SceneManager.getInstance().addScene("page5",new Scene(root5));
        SceneManager.getInstance().addScene("page6",new Scene(root6));
        SceneManager.getInstance().addScene("page7",new Scene(root7));
        SceneManager.getInstance().addScene("page8",new Scene(root8));
        SceneManager.getInstance().addScene("page9",new Scene(root9));
        SceneManager.getInstance().addScene("page10",new Scene(root10));
        SceneManager.getInstance().loadScene("page1");
        primaryStage.show();


    }}
