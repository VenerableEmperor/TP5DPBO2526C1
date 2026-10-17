/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package human.tpfive;

/**
 *
 * @author ACER
 */
import java.sql .*;


public class Database {
    private Connection connection;
    private Statement statement;


    // constructor
    public Database() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost: 3306/db_people",
                    "root",
                    "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    // diqunakan untuk SELECT
    public ResultSet selectQuery(String sql) {
        try {
            statement.executeQuery(sql);
            return statement.getResultSet();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // diqunakan untuk UPDATE, INSERT, DELETE
    public int insertUpdateDeleteQuery(String sql){
        try {
            return statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    // getter
    public Statement getStatement() {
        return statement;
    }
}
