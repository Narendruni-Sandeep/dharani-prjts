package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("org.postgresql.Driver");  
            c =DriverManager.getConnection("jdbc:postgresql://localhost/Dharani_prjt","postgres","Sandeep@1234");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  