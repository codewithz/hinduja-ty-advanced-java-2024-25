package com.codewithz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class InsertData {

    public static void main(String[] args) {

        try{
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/hinduja_24_25_ty";
            String user="postgres";
            String password="admin";

            Connection con=DriverManager.getConnection(url,user,password);


            String name="Tom3";
            String email="tom3@gmail.com";
            long contact=9988776655L;
            LocalDate accountCreationDate=LocalDate.now();

            String query="Insert into customer(name,email,contact,account_creation_date) values (?,?,?,?)";

            PreparedStatement pstmt=con.prepareStatement(query);

            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setLong(3,contact);
            pstmt.setObject(4,accountCreationDate);

            int rowsInserted=pstmt.executeUpdate();

            System.out.println("No of rows inserted:"+rowsInserted);


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
