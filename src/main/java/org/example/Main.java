package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    static void main() {
        try {
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/colege",
                    "root",
                    "root"
            );

            System.out.println("data base connected");

            Statement stmt = cn.createStatement();


            String sql = "INSERT INTO std_data(name,marks,attend) VALUES " +
                    "('trish', 150,12), " +
                    "('Rahul', 200,14), " +
                    "('Ayesha', 300,15), " +
                    "('Ali', 250,16)";

            stmt.executeUpdate(sql);

            System.out.println("All records inserted successfully!");

            System.out.println("employe inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}