package sample;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;

public class SceneManager {

    private SceneManager(){}
    private static SceneManager instance;

    private Stage stage;

    private HashMap<String,Scene> map = new HashMap<>();

    public static SceneManager getInstance(){
        if(instance == null){
            instance = new SceneManager();
        }
        return instance;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void addScene(String key, Scene value){
        map.put(key,value);
    }

    public void loadScene(String key){
        stage.setScene(map.get(key));
    }

}
