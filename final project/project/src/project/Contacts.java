package project;

import java.util.regex.Pattern;

public class Contacts {
    private String Name ;
    private String Phone ;
    private String Email  ;
    private String message; 
    private boolean f;
    
     {
        message="";
        Name="";
        Phone="";
        Email ="";
        f=true;
     }
    public String getMessage() {
        return message;
    }


    
    
    
    public Contacts(String Name, String Phone, String Email) {
        setName(Name);
        setPhone(Phone);
        setEmail(Email);
    }
    
    
    
    

    public String getName() {
        return Name.trim();
    }

    public void setName(String Name) {
      if (Name.trim().replaceAll("[ ]+", " ").length() >= 4) {
            this.Name = Name.trim().replaceAll("[ ]+", " ");
        } else {
            message += " INVALID NAME\n";
            f = false;
        } 
    }
       
    

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
    if (Pattern.matches("((\\+201)|(201)|(01))[0125]\\d{8}$", Phone.trim())) { //Egyption number only by regex
            this.Phone = Phone.trim();            
        } else {
            message += "INVALID PHONE NUMBER \n";
            f = false;
        }
       
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if (Pattern.matches("[a-z0-9]{5,20}@[a-z]{3,10}\\.[a-z]{3,6}$", Email.trim().toLowerCase())) { // simple regex for check email
            this.Email = Email.trim().toLowerCase();        
        } else {
             message += "INVALID EMAIL\n";
            f = false;
        } 
       
       }

        public boolean flag(){
           return f;
    }
     
        
    
    
}
