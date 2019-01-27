package sample;

import javafx.scene.control.Button;

public class Controller2 {
    public Button adduser;
    public Button addresource;
    public Button resourcesearch;
    public Button usersearch;
    public Button lend;
    public Button returnbook;
    public Button blacklist;
    public Button changepass;


    public void setAdduser() {
        SceneManager.getInstance().loadScene("page3");
    }

    public void setAddresource() {
        SceneManager.getInstance().loadScene("page4");
    }

    public void setResourcesearch() {
        SceneManager.getInstance().loadScene("page5");
    }

    public void setUsersearch() {
        SceneManager.getInstance().loadScene("page6");
    }

    public void setLend() {
        SceneManager.getInstance().loadScene("page7");
    }

    public void setReturnbook() {
        SceneManager.getInstance().loadScene("page8");
    }

    public void setBlacklist() {
        SceneManager.getInstance().loadScene("page9");
    }


}
