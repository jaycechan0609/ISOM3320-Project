import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.io.*;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;


public class EditDeleteCleanerController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField search_data;

    @FXML
    private Button search_but;

    @FXML
    private TextField id;

    @FXML
    private TextField email;

    @FXML
    private TextField name;

    @FXML
    private TextField phone;

    @FXML
    private TextField salary;

    @FXML
    private Button edit_but;

    @FXML
    private Button delete_but;

    @FXML
    private Button back_but;

    @FXML
    private TableView <Cleaner> cleaner_tableview;

    @FXML
    private TableColumn<Cleaner, String> id_col;

    @FXML
    private TableColumn<Cleaner, String> name_col;

    @FXML
    private TableColumn<Cleaner, String> phone_col;

    @FXML
    private TableColumn<Cleaner, String> email_col;

    @FXML
    private TableColumn<Cleaner, String> salary_col;
    

    @FXML
    void back(ActionEvent event) throws IOException {
      ReadData.switchScene("ManageCleaner");

    }

    @FXML
    void delete(ActionEvent event) throws IOException{
      for (int j = 0; j<ReadData.cleanerArrayList.size(); j++){
       if (search_data.getText().equals(ReadData.cleanerArrayList.get(j).getCleanerID())){
         ReadData.cleanerArrayList.remove(j);
         
      ReadData.updateCleanerCSV(); 
      
       }
     }

    }

    @FXML
    void edit(ActionEvent event) throws IOException{
      ObservableList<Cleaner> list = FXCollections.observableArrayList();
     for (int j = 0; j<ReadData.cleanerArrayList.size(); j++){
       if (search_data.getText().equals(ReadData.cleanerArrayList.get(j).getCleanerID())){
         ReadData.cleanerArrayList.get(j).setCleanerID(id.getText());
         ReadData.cleanerArrayList.get(j).setCleanerName(name.getText());
         ReadData.cleanerArrayList.get(j).setCleanerPhone(phone.getText());
         ReadData.cleanerArrayList.get(j).setCleanerEmail(email.getText());
         ReadData.cleanerArrayList.get(j).setCleanerSalary(salary.getText());

      ReadData.updateCleanerCSV();
      cleaner_tableview.setItems(list);
       }
     }
    }

    @FXML
    void search(ActionEvent event) {
      id.setText(Cleaner.search(search_data.getText()).get(0));
      name.setText(Cleaner.search(search_data.getText()).get(1));   
      phone.setText(Cleaner.search(search_data.getText()).get(2));
      email.setText(Cleaner.search(search_data.getText()).get(3));
      salary.setText(Cleaner.search(search_data.getText()).get(4));
      
      
      ObservableList<Cleaner> list = FXCollections.observableArrayList();
      
      for (int j = 0; j<ReadData.cleanerArrayList.size(); j++){
        if(search_data.getText().equals (ReadData.cleanerArrayList.get(j).getCleanerID())){
        list.add(ReadData.cleanerArrayList.get(j));
        }
       }
     
        id_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerID"));
        
        name_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerName"));

        phone_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerPhone"));

        email_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerEmail"));
            
        salary_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerSalary"));
        
                
        cleaner_tableview.setItems(list);     

    }

      
  
      ObservableList<Cleaner> list = FXCollections.observableArrayList();
    
    @Override
   public void initialize(URL url, ResourceBundle rb) {
       for (int j = 0; j<ReadData.cleanerArrayList.size(); j++){                                                              
      list.add(ReadData.cleanerArrayList.get(j));
       }
       
  
       id_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerID"));
        
        name_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerName"));

        phone_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerPhone"));

        email_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerEmail"));
            
        salary_col.setCellValueFactory(new PropertyValueFactory<Cleaner,String>("cleanerSalary"));
                
        cleaner_tableview.setItems(list);      
                                                                      }
    }





//public class EditDeleteCleanerController implements Initializable{
//
//    @FXML
//    private ResourceBundle resources;
//
//    @FXML
//    private URL location;
//
//    @FXML
//    private TextField search_data;
//
//    @FXML
//    private Button search_but;
//
//    @FXML
//    private TextField id;
//
//    @FXML
//    private TextField email;
//
//    @FXML
//    private TextField name;
//
//    @FXML
//    private TextField phone;
//
//    @FXML
//    private TextField salary;
//
//    @FXML
//    private Button edit_but;
//
//    @FXML
//    private Button delete_but;
//
//    @FXML
//    private Button back_but;
//

//
  
//
 
//

//
//      
