import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import java.io.*;
import java.util.*;

public class AddAppointmentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cus_name;

    @FXML
    private TextField cus_phonenum;

    @FXML
    private TextField cus_address;

    @FXML
    private Button add_but;

    @FXML
    private Button back_but;

    @FXML
    private Text reminder;

    @FXML
    private TextField apm_amount;

    @FXML
    private DatePicker date_picker;

    @FXML
    private MenuButton time_hour;

    @FXML
    private MenuButton time_minute;

    @FXML
    private MenuButton duration;

    @FXML
    private TextField cleaner_id;
    
    private String hour;
    private String min;
    private String dur;

    @FXML
    void Add(ActionEvent event) throws IOException{
      
      String temp_id = "A" + String.valueOf(ReadData.appointmentArrayList.size()+1);
      
      if(!cus_name.getText().isEmpty() && !cus_phonenum.getText().isEmpty() 
                              && !cus_address.getText().isEmpty() && !date_picker.getValue().toString().isEmpty()
           && !hour.isEmpty() && !min.isEmpty() && !dur.isEmpty() && !cleaner_id.getText().isEmpty() && !apm_amount.getText().isEmpty()){
        Appointment a = new Appointment(temp_id, cus_name.getText(), cus_phonenum.getText(), 
                                      cus_address.getText(), date_picker.getValue().toString(), hour+":"+min, 
                                      dur, cleaner_id.getText(), apm_amount.getText());
     
        ReadData.appointmentArrayList.add(a);
        ReadData.updateAppointmentCSV();
        ReadData.switchScene("AddAppointmentSuccessfully");  
        
      }
      else{
        reminder.setText("You have to fill in all information");
        reminder.setFill(Color.FIREBRICK);
      }
    }

    @FXML
    void Back(ActionEvent event) throws IOException {
      ReadData.switchScene("ManageAppointment");

    }

    @FXML
    void apm_00hr(ActionEvent event) {
      hour="00";
      time_hour.setText(hour);
    }

    @FXML
    void apm_00min(ActionEvent event) {
      min="00";
      time_minute.setText(min);
    }

    @FXML
    void apm_01hr(ActionEvent event) {
      hour="01";
      time_hour.setText(hour);
    }

    @FXML
    void apm_02hr(ActionEvent event) {
      hour="02";
      time_hour.setText(hour);
    }

    @FXML
    void apm_03hr(ActionEvent event) {
      hour="03";
      time_hour.setText(hour);
    }

    @FXML
    void apm_04hr(ActionEvent event) {
      hour="04";
      time_hour.setText(hour);
    }

    @FXML
    void apm_05hr(ActionEvent event) {
      hour="05";
      time_hour.setText(hour);
    }

    @FXML
    void apm_06hr(ActionEvent event) {
      hour="06";
      time_hour.setText(hour);
    }

    @FXML
    void apm_07hr(ActionEvent event) {
      hour="07";
      time_hour.setText(hour);
    }

    @FXML
    void apm_08hr(ActionEvent event) {
      hour="08";
      time_hour.setText(hour);
    }

    @FXML
    void apm_09hr(ActionEvent event) {
      hour="09";time_hour.setText(hour);
    }

    @FXML
    void apm_10dur(ActionEvent event) {
      dur="10";
      duration.setText(dur);
    }

    @FXML
    void apm_10hr(ActionEvent event) {
      hour="10";
      time_hour.setText(hour);
    }

    @FXML
    void apm_11hr(ActionEvent event) {
      hour="11";
      time_hour.setText(hour);
    }

    @FXML
    void apm_12hr(ActionEvent event) {
      hour="12";
      time_hour.setText(hour);
    }

    @FXML
    void apm_13hr(ActionEvent event) {
      hour="13";
      time_hour.setText(hour);
    }

    @FXML
    void apm_14hr(ActionEvent event) {
      hour="14";
      time_hour.setText(hour);
    }

    @FXML
    void apm_15hr(ActionEvent event) {
      hour="15";
      time_hour.setText(hour);
    }

    @FXML
    void apm_15min(ActionEvent event) {
      min="15";
      time_minute.setText(min);
    }

    @FXML
    void apm_16hr(ActionEvent event) {
      hour="16";
      time_hour.setText(hour);
    }

    @FXML
    void apm_17hr(ActionEvent event) {
      hour="17";
      time_hour.setText(hour);
    }

    @FXML
    void apm_18hr(ActionEvent event) {
      hour="18";
      time_hour.setText(hour);
    }

    @FXML
    void apm_19hr(ActionEvent event) {
      hour="19";
      time_hour.setText(hour);
    }

    @FXML
    void apm_1dur(ActionEvent event) {
      dur="1";
      duration.setText(dur);
    }

    @FXML
    void apm_20hr(ActionEvent event) {
      hour="20";
      time_hour.setText(hour);
    }

    @FXML
    void apm_21hr(ActionEvent event) {
      hour="21";
      time_hour.setText(hour);
    }

    @FXML
    void apm_22hr(ActionEvent event) {
      hour="22";
      time_hour.setText(hour);
    }

    @FXML
    void apm_23hr(ActionEvent event) {
      hour="23";
      time_hour.setText(hour);
    }

    @FXML
    void apm_2dur(ActionEvent event) {
      dur="2";
      duration.setText(dur);
    }

    @FXML
    void apm_30min(ActionEvent event) {
      min="30";
      time_minute.setText(min);
    }

    @FXML
    void apm_3dur(ActionEvent event) {
      dur="3";
      duration.setText(dur);
    }

    @FXML
    void apm_45min(ActionEvent event) {
      min="45";
      time_minute.setText(min);
    }

    @FXML
    void apm_4dur(ActionEvent event) {
      dur="4";
      duration.setText(dur);
    }

    @FXML
    void apm_5dur(ActionEvent event) {
      dur="5";
      duration.setText(dur);
    }

    @FXML
    void apm_6dur(ActionEvent event) {
      dur="6";
    }

    @FXML
    void apm_7dur(ActionEvent event) {
      dur="7";
      duration.setText(dur);
    }

    @FXML
    void apm_8dur(ActionEvent event) {
      dur="8";
      duration.setText(dur);
    }

    @FXML
    void apm_9dur(ActionEvent event) {
      dur="9";
      duration.setText(dur);
    }

    @FXML
    void initialize() {
        
    }
}
