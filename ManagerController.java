import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.*;

public class ManagerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button manageCleaner_button;

    @FXML
    private Button manageAppointment_button;

    @FXML
    private Button report_button;

    @FXML
    private Button top3cleaner_button;

    @FXML
    private Button logout_button;

    @FXML
    void logout(ActionEvent event) throws IOException{
      ReadData.switchScene("Login");
    }
    @FXML
    void manageAppointment(ActionEvent event) throws IOException{
      ReadData.switchScene("ManageAppointment");

    }

    @FXML
    void manageCleaner(ActionEvent event) throws IOException{
      ReadData.switchScene("ManageCleaner");

    }

    @FXML
    void report(ActionEvent event) throws IOException{
      ReadData.switchScene("MonthlySalaryReport");

    }

    @FXML
    void top3cleaner(ActionEvent event) throws IOException{
      ReadData.switchScene("TopThreeCleaner");

    }

    @FXML
    void initialize() {
      
    }
}
