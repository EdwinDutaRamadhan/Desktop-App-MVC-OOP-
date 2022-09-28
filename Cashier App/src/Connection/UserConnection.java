package Connection;

import Model.UserModel;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

public class UserConnection {
    public Connection koneksi = null;
    public Connection getConnection(){
        try {
        MysqlDataSource user = new MysqlDataSource();
        user.setServerName("localhost");
        user.setPortNumber(3306);
        user.setUser("root");
        user.setPassword("");
        user.setDatabaseName("db_cashier");
        koneksi = user.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return koneksi;        
    }
}
