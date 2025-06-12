/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package educationalapplication_ead_cw.Db;
import java.sql.*;

/**
 *
 * @author ktime
 */
public class DBcon {
    
 String url = "jdbc:mysql://localhost/edu_db";
    String user = "root";
    String pass = "";

// Open Conncetion With Database
    public Connection OpenConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection dbCon = DriverManager.getConnection(this.url, this.user, this.pass);
            return dbCon;
        } catch (Exception e) {
            System.out.println("Database Connection Problem :"+e);
        }
        return null;
    }
//Data Insert TO Database

    public void InsertData(String Query) {
        try {
            Connection dbCon = this.OpenConnection();
            Statement stmt = dbCon.createStatement();
            stmt.executeUpdate(Query);
        } catch (Exception e) {
            System.out.println("Database Data Instertion Problem :"+e);
        }
    }
// Selecting Data from Database

    public ResultSet SelectData(String Query) {
        try {
            ResultSet rs;
            Connection dbCon = this.OpenConnection();
            Statement stmt = dbCon.createStatement();
            rs = stmt.executeQuery(Query);
            return rs;
        } catch (Exception e) {
            System.out.println("Data Selecting Error :"+e);
        }
        return null;
    }

// Closing Connection with the Database    
    public void CloseConnection(Connection dbcon) {
        try {
            dbcon.close();
            System.out.println("DB Closing");
        } catch (Exception e) {
            System.out.println("There is an issue with closing DB :" +e);
        }
    }
}
