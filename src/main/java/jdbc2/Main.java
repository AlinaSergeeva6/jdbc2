package jdbc2;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/myorders";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "1111";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code code = new Code();

        try{

            code.conn=DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            //code.initDB();
            code.menu();
        }catch (SQLException e){
            e.printStackTrace();
        }

}
}
