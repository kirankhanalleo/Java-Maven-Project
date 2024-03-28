package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.sql.*;
public class KiranJDBCDisplay {
    public static void main(String [] args){
        String url ="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            String query="SELECT * FROM clients";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("id"));                
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("email"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
