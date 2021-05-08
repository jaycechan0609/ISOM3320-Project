import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.*;

public class ManageAppointmentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_appointment_but;

    @FXML
    private Button edit_del_appointment_but;

    @FXML
    private Button back_but;

    @FXML
    void addAppointment(ActionEvent event) throws IOException {
      ReadData.switchScene("AddAppointment");

    }

    @FXML
    void back(ActionEvent event) throws IOException  {
      ReadData.switchScene("Manager");

    }

    @FXML
    void editDeleteAppointment(ActionEvent event) throws IOException  {
      ReadData.switchScene("EditDeleteAppointment");

    }

    @FXML
    void initialize() {
        
    }
}
