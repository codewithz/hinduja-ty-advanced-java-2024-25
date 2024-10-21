package com.codewithz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {

    public static void main(String[] args) {

        try{
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/hinduja_24_25_ty";
            String user="postgres";
            String password="admin";

            Connection con=DriverManager.getConnection(url,user,password);

            int id=2;
            String query="Delete from  customer where id=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setInt(1,id);

            int rowsDeleted=pstmt.executeUpdate();
            System.out.println("No of rows deleted:"+rowsDeleted);


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
