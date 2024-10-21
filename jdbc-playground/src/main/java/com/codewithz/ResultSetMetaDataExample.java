package com.codewithz;

import java.sql.*;

public class ResultSetMetaDataExample {

    public static void main(String[] args) {
        try{
            String url="jdbc:postgresql://localhost:5432/hinduja_24_25_ty";
            String user="postgres";
            String password="admin";

            Class.forName("org.postgresql.Driver");

            Connection con= DriverManager.getConnection(url,user,password);

            String query="Select * from customer";
            PreparedStatement pstmt=con.prepareStatement(query);
            ResultSet rs=pstmt.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();

            int columnCount=rsmd.getColumnCount();
            if (rs.next()){
                for (int i = 1; i <= columnCount; i++){
                    System.out.print(rsmd.getColumnName(i)+"  "+rsmd.getColumnTypeName(i));
                    System.out.println("\n");
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
