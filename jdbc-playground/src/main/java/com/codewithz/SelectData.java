package com.codewithz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {
    public static void main(String[] args) {

        try{
            String url="jdbc:postgresql://localhost:5432/hinduja_24_25_ty";
            String user="postgres";
            String password="admin";

            Class.forName("org.postgresql.Driver");

            Connection con= DriverManager.getConnection(url,user,password);

            String query="Select name,contact,email,account_creation_date from customer";
            PreparedStatement pstmt=con.prepareStatement(query);
            ResultSet rs=pstmt.executeQuery();

            while(rs.next()){
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Email: "+rs.getString("email"));
                System.out.println("Contact: "+rs.getLong("contact"));
                System.out.println("Name: "+rs.getString("account_creation_date"));
                System.out.println("--------------------------------------------------------");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
