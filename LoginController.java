import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import java.io.*;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button login_button;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;
    
    @FXML
    private Text reminder;

    @FXML
    void login(ActionEvent event) throws IOException{
      if (Manager.login(username.getText(), password.getText())){
        ReadData.userid = username.getText();
        ReadData.switchScene("Manager");
      }else{
        reminder.setText("Invalid Username/Password");
        reminder.setFill(Color.FIREBRICK);
      }
      
    }

    @FXML
    void initialize() {
        
    }
}
