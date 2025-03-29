package ConnectionMysql;

import java.sql.*;

public class Con {
    public Connection c;
    public Statement s;
    public Con(){
        try {
            c=DriverManager.getConnection("jdbc:mysql:///chatapp","root","Sonia1978");
            s=c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
