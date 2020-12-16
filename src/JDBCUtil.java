import java.sql.*;

public class JDBCUtil {
    // JDBC 드라이버 초기화 및 Connection 객체생성
    public static Connection makecConn() {
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.cw2h1nljbpsk.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWD = "playground2020";
        Connection conn = null;
        try {
            Class.forName(DRV);
            conn= DriverManager.getConnection(URL,USR,PWD);

        } catch (ClassNotFoundException e) {
            System.out.println("너 드라이버에 문제있어?");
        } catch (SQLException e) {
            System.out.println("JDBC 연결실패");
        }
        return conn;
    }

    // JDBC 관련 객체 해제
    public static void destroyConn(Connection conn, PreparedStatement pstmt) {
        if (pstmt != null)
            try { pstmt.close(); }
            catch (SQLException throwables){ }

        if (conn != null)
            try { conn.close(); }
            catch (SQLException throwables) { }

    }
    // rs를 추가하기위해 기존 메서드에서 추가함 form JDBCBooks4
    public static void destroyConn(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        if (rs != null)
            try { rs.close(); }
            catch (SQLException throwables){ }
        destroyConn(conn,pstmt);
    }
}
