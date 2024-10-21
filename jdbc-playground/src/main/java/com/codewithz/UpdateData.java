package com.codewithz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class UpdateData {

    public static void main(String[] args) {

        try{
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/hinduja_24_25_ty";
            String user="postgres";
            String password="admin";

            Connection con=DriverManager.getConnection(url,user,password);


            String name="Thomas";
            String email="thomas@gmail.com";
            int id=4;

            String query="Update customer set name=?,email=? where id=?";

            PreparedStatement pstmt=con.prepareStatement(query);

            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setInt(3,id);


            int rowsUpdated=pstmt.executeUpdate();

            System.out.println("No of rows updated:"+rowsUpdated);


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
