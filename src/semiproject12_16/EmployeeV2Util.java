package semiproject12_16;

import javax.xml.transform.Result;
import java.sql.*;

public class EmployeeV2Util {

    // DB접속 하기
    public static Connection makeConn(){
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.cw2h1nljbpsk.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWD = "playground2020";
        Connection conn=null;

        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USR,PWD);
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 접속 오류");
        } catch (SQLException throwables) {
            System.out.println("DB접속 오류");
        }
        return conn;
    }
    // DB연결 해제
    public static void destroyConn(Connection conn, PreparedStatement pstmt, ResultSet rs){
        if (conn != null) try { conn.close(); } catch (SQLException throwables) { }
            if (pstmt != null)  try { pstmt.close(); } catch (SQLException throwables) { }
                if (rs != null)  try { rs.close(); } catch (SQLException throwables) { }
    }
    public static void destroyConn(Connection conn, PreparedStatement pstmt ){
        if (conn != null) try { conn.close(); } catch (SQLException throwables) { }
        if (pstmt != null)  try { pstmt.close(); } catch (SQLException throwables) { }
    }



}
