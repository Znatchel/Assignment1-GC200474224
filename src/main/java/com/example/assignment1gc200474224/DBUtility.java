package com.example.assignment1gc200474224;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;



public class DBUtility {
    private static String user = ""; //MySQL server username
    private static String pw = "";   //MySQL server password

    //jdbc:mysql = Java DataBase Connector to MySQL
    //127.0.0.1 = IP address where the MySQL server is
    //3306 = Port # that MySQL server is accessible on
    //F22 = the database name
    private static String connectUrl = "jdbc:mysql://127.0.0.1:3306";

    public static ArrayList<NuclearArms> getNukesFromDB()
    {
        ArrayList<NuclearArms> nukes = new ArrayList<>();

        //create the sql string we want to run on the database
        String sql = "SELECT * FROM nuclearoption.`nuclear-warhead-stockpiles`";

        //the try () is called "try with resources".  Anything opened in the () will
        //automatically close when the try block is done.
        try(
                //1.  connect to the database
                Connection conn = DriverManager.getConnection(connectUrl,user,pw);

                //2.  create a statement object
                Statement statement = conn.createStatement();

                //3.  use the statement object to run the sql and return a ResultSet object
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            //4.  loop over the resultSet and create Topping objects
            while (resultSet.next())
            {
                String country = resultSet.getString("country");
                String countryCode = resultSet.getString("countryCode");
                int year = resultSet.getInt("year");
                int amountOfWeapons = resultSet.getInt("amountOfWeapons");
                int id = resultSet.getInt("id");
                NuclearArms newNuclearArms = new NuclearArms(country,countryCode,year,amountOfWeapons,id);
                nukes.add(newNuclearArms);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return nukes;
    }

}



