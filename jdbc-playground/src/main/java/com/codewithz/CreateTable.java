package com.codewithz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable {

    public static void main(String[] args) {

        try{
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/hinduja_24_25_ty";
            String user="postgres";
            String password="admin";

            Connection con=DriverManager.getConnection(url,user,password);

            String query="Create table test_1 (id integer, name text)";

            PreparedStatement pstmt=con.prepareStatement(query);

            boolean status=pstmt.execute();

            if(!status){
                System.out.println("Table created successfully");
            }


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
