package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    // @FXML注解用于标记由FXML使用的非公开的控制器成员属性和事件处理方法
    @FXML private Text actionTarget;
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actionTarget.setText("Sign in Button Pressed");
    }
}
