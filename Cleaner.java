import java.util.ArrayList;

public class Cleaner{
  private String cleanerID;
  private String cleanerName;
  private String cleanerPassword;
  private String cleanerTeam;
  private String cleanerPhone;
  private String cleanerEmail;
  private String cleanerSalary;
  private String cleanerWorkingHour;
  private String cleanerTotalSalary;
  private String cleanerRank;
 
  public Cleaner(){
  }
  
  public Cleaner(String cleanerID, String cleanerName,String cleanerPassword, 
                 String cleanerTeam, String cleanerPhone, String cleanerEmail,
                 String cleanerSalary,String cleanerWorkingHour,String cleanerTotalSalary){
    this.cleanerID = cleanerID;
    this.cleanerName = cleanerName;
    this.cleanerPassword = cleanerPassword;
    this.cleanerTeam = cleanerTeam;
    this.cleanerPhone = cleanerPhone;
    this.cleanerEmail = cleanerEmail;
    this.cleanerSalary = cleanerSalary;
    this.cleanerWorkingHour = cleanerWorkingHour;
    this.cleanerTotalSalary = cleanerTotalSalary;
    
  }
  
  public void setCleanerID(String id){
    this.cleanerID = id;
  }
  
  public void setCleanerName(String name){
    this.cleanerName = name;
  }
  
  public void setCleanerPassword(String pw){
    this.cleanerPassword = pw;
  }
  
  public void setCleanerTeam(String team){
    this.cleanerTeam = team;
  }
  
  public void setCleanerPhone(String phone){
    this.cleanerPhone = phone;
  }
  
  public void setCleanerEmail(String email){
    this.cleanerEmail = email;
  }
  
  public void setCleanerSalary(String salary){
    this.cleanerSalary = salary;
  }

  public String getCleanerID(){
    return this.cleanerID;
  }
  public String getCleanerName(){
    return this.cleanerName;
  }
  public String getCleanerPassword(){
    return this.cleanerPassword;
  }
  public String getCleanerTeam(){
    return this.cleanerTeam;
  }
  public String getCleanerPhone(){
    return this.cleanerPhone;
  }
  public String getCleanerEmail(){
    return this.cleanerEmail;
  }
  public String getCleanerSalary(){
    return this.cleanerSalary;
  }
  public void setCleanerWorkingHour(String workingHour){
    this.cleanerWorkingHour = workingHour;
  }
  
  public void setCleanerTotalSalary(String totalSalary){
    this.cleanerTotalSalary = totalSalary;
    this.setCleanerWorkingHour(Float.toString(Float.parseFloat(totalSalary)/Float.parseFloat(this.cleanerSalary)));
  }
  public void setCleanerRank(String rank){
    this.cleanerRank = rank;
  }
  
  
  
  public static ArrayList<String> search(String id){
    ArrayList<String> search = new ArrayList<String>();
    for (Cleaner c: ReadData.cleanerArrayList){
      if (c.cleanerID.equals(id)){    
        search.add(c.getCleanerID());
        search.add(c.getCleanerName());      
        search.add(c.getCleanerPhone());
        search.add(c.getCleanerEmail());
        search.add(c.getCleanerSalary());
      }
       
      
    }
    return search;
  
   
  }
  

  
  
  
  
  
  
}
