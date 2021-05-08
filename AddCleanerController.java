import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import java.io.*;
import java.util.*;
  
public class AddCleanerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField name;

    @FXML
    private TextField phone_no;

    @FXML
    private TextField email;

    @FXML
    private Button add_but;

    @FXML
    private Button back_but;

    @FXML
    private TextField password;

    @FXML
    private TextField team;
    
    @FXML
    private Text reminder;
//oid update(ActionEvent event) throws IOException { 
//      for (int i=0; i< ReadData.staffArrayList.size();i++){ 
//        if (ReadData.staffArrayList.get(i).getStaffID().equals(id.getText())){ 
//          ReadData.staffArrayList.get(i).setStaffName(name.getText()); 
//        } 
//      } 
//      ReadData.updateStaffCSV(); 
//       
//    }
    @FXML
    void Add(ActionEvent event) throws IOException{
    
      String temp_id = "C"+ String.valueOf(ReadData.cleanerArrayList.size()+1);
      String temp_salary = "50";
      
      if(!name.getText().isEmpty() && !password.getText().isEmpty() 
                              && !team.getText().isEmpty() && !phone_no.getText().isEmpty()
           && !email.getText().isEmpty() && !temp_salary.isEmpty()){
      Cleaner c = new Cleaner(temp_id, name.getText(), password.getText(), 
                              team.getText(), phone_no.getText(), email.getText(), temp_salary);                                                 
      ReadData.cleanerArrayList.add(c);
      ReadData.updateCleanerCSV();     
      ReadData.switchScene("AddCleanerSuccessfully");
      }
      
      else{       
        reminder.setText("You have to fill in all the boxes");
        reminder.setFill(Color.FIREBRICK);
    }
    }

    @FXML
    void Back(ActionEvent event) throws IOException{
    ReadData.switchScene("ManageCleaner");
    }

    @FXML
    void initialize() {
       
    }
}
