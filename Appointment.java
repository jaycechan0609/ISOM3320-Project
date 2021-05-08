import java.util.ArrayList;

public class Appointment{
  private String appointmentID;
  private String customerName;
  private String customerPhone;
  private String customerAddress;
  private String appointmentDate;
  private String appointmentTime;
  private String appointmentDuration;
  private String appointmentStaff;
  private String appointmentAmount;
  
  
  public Appointment(){
  }
  
  public Appointment(String appointmentID, String customerName,String customerPhone, 
                     String customerAddress, String appointmentDate, String appointmentTime, 
                     String appointmentDuration, String appointmentStaff, String appointmentAmount){
    this.appointmentID = appointmentID;
    this.customerName = customerName;
    this.customerPhone = customerPhone;
    this.customerAddress = customerAddress;
    this.appointmentDate = appointmentDate;
    this.appointmentTime = appointmentTime;
    this.appointmentDuration = appointmentDuration;
    this.appointmentStaff = appointmentStaff;
    this.appointmentAmount = appointmentAmount;
  }
  
  public void setAppointmentID(String id){
    this.appointmentID = id;
  }
  
  public void setCustomerName(String name){
    this.customerName = name;
  }
  
  public void setCustomerPhone(String phone){
    this.customerPhone = phone;
  }
  
  public void setCustomerAddress(String address){
    this.customerAddress = address;
  }
  
  public void setAppointmentDate(String date){
    this.appointmentDate = date;
  }
  
  public void setAppointmentTime(String time){
    this.appointmentTime = time;
  }
  
  public void setAppointmentDuration(String duration){
    this.appointmentDuration = duration;
  }
  
  public void setAppointmentStaff(String staff){
    this.appointmentStaff = staff;
  }
  
  public void setAppointmentAmount(String amount){
    this.appointmentAmount = amount;
  }

  public String getAppointmentID(){
    return this.appointmentID;
  }
  public String getCustomerName(){
    return this.customerName;
  }
  public String getCustomerPhone(){
    return this.customerPhone;
  }
  public String getCustomerAddress(){
    return this.customerAddress;
  }
  public String getAppointmentDate(){
    return this.appointmentDate;
  }
  public String getAppointmentTime(){
    return this.appointmentTime;
  }
  public String getAppointmentDuration(){
    return this.appointmentDuration ;
  }
  public String getAppointmentStaff(){
    return this.appointmentStaff ;
  }
  public String getAppointmentAmount(){
    return this.appointmentAmount ;
  }
  
  
  public static ArrayList<String> search(String id){
    ArrayList<String> search = new ArrayList<String>();
    for (Appointment a: ReadData.appointmentArrayList){
      if (a.appointmentID.equals(id)){    
        search.add(a.getAppointmentID());
        search.add(a.getCustomerName());      
        search.add(a.getCustomerPhone());
        search.add(a.getCustomerAddress());
        search.add(a.getAppointmentDate());
        search.add(a.getAppointmentTime());
        search.add(a.getAppointmentDuration());
        search.add(a.getAppointmentStaff());
        search.add(a.getAppointmentAmount());
      }
       
      
    }
    return search;
  
   
  } 
}
