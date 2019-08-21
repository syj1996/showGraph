package main.webapp.driuddemo;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Driud 连接池的工具类
 */
public class JDBCUtils {
    //1.定义成员变量DataSource
    private static DataSource ds1;
    static{
        Properties pro=new Properties();
        try {
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("main/webapp/driuddemo/druid.properties"));//getClassLoader用于动态的加载配置文件到JDBCUtils中
            String url="jdbc:mysql://127.0.0.1:3306/demo";
            pro.setProperty("url",url);
            ds1= DruidDataSourceFactory.createDataSource(pro);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取连接
    public static Connection getConnection() throws SQLException {
        return ds1.getConnection();
    }
    //释放资源
    public static void close(Statement stmt,Connection conn){
        close(null,stmt,conn);
    }
    public static void close(ResultSet rs,Statement stmt, Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();  //释放资源
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();//归还连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //获取连接池的方法
    public static DataSource getDataSource1() {
        return ds1;
    }
}
